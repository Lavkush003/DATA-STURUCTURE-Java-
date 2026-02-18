
// public class Polymorphism {
//     public static void main(String args[]){
//         Calculator calc=new Calculator();
//         System.out.println(calc.sum(1, 2));

//        System.out.println(calc.sum((float)1.5, (float)2.5));

//         System.out.println(calc.sum(1, 2, 3));

//         Deer d=new Deer();
//         d.eat();





//     }
// }

// class Calculator {

//     // Method Overloading

//     int sum(int a, int b){
//         return a+b;
//     }

//      float sum(float a, float b){
//         return a+b;
//      }
//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }

// // Function overriding

// class Animal {
//     void eat(){
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("eats grass");
//     }
// }



public class Polymorphism{
    public static void main(String args[]){

        Mustang myHorse = new Mustang();

        //Animal->Horse->Mustang

        // Horse h=new Horse();
        // h.eat();
        // h.walk();

        // Chicken c=new Chicken();

        // c.eat();
        // c.walk();

    }
}

//abstraction

//abstract class

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");

    }

    abstract void walk();
}

class Horse extends Animal {   // implementation of abstract class
    
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }
    
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}