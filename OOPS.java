
public class OOPS {

    public static void main(String args[]){
        Pen p1=new Pen(); // created a pen object called p1
        p1.setColor("Blue");
       // System.out.println(p1.color);
       System.out.println(p1.getColor());
        p1.setTip(5);
       // System.out.println(p1.tip);

       System.out.println(p1.getTip());

       // p1.setColor("Yellow");

       p1.setColor("Yellow");
       System.out.println(p1.getColor());

        BankAccount myAcc=new BankAccount();
        myAcc.username="lovekushnishad";
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.username);
       // System.out.println(setPassword);

       //System.out.println(password);


    }

}

class BankAccount {
    public String username;

    private String password;

    public void setPassword(String pwd){
        password=pwd;
    }
}

class Pen {
    // String color;
    private String color;
    // int tip;

    private int tip;
    //using getter and setter

    String getColor() {

        return this.color;


    }

    int getTip() {
        return this.tip;
    }


    void setColor (String newColor){
        color=newColor;

    }

    void setTip (int newTip){
        tip=newTip;
    }


}

class Student {
    String name;

    int age;
    float percentage; 
    void calclPercentage(int phy, int chem, int math){
        percentage=(phy + chem + math)/3;

    }
}