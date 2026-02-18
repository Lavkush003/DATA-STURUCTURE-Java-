
//     public static void main(String args[]){
//         int counter=0;
//         while(counter<10){
//             System.out.println("Hello World");
//             counter++;
//         }
//     }
// }

//print 1 to 10

// public class LoopsBasics{
//     public static void main(String args[]){
//         int counter=1;
//         while(counter<=10){
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }

//print 1 to n

public class LoopsBasics {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);

        // // int range=sc.nextInt();
        // // int counter=1;

        // // while(counter<=range){
        // //     System.out.print(counter + " ");
        // //     counter++;
        // // }
        // // System.out.println();
        // int n=sc.nextInt();

        // int sum=0;

        // int i=1;

        // while(i<=n){
        //     sum+=i;

        //     i++;
        // }
        // System.out.println("sum is : "+ sum);

        // Revesre a number

        // int n=10899;
        // int rev=0;
        // while(n>0){
        //     int lastDigit=n%10;
        //     rev=(rev*10) +lastDigit;
        //     n=n/10;
        // }
        // System.out.println("Reversed Number: "+rev);

        // do while loop

        // int counter=1;

        // do { 
        // System.out.println("Hello World");
        // counter++;
            
        // } while(counter<=10);

        // // break statement

        // for(int i=0;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        //Enter number until user enter a multiple of 10

        //Scanner sc=new Scanner(System.in);


        // do { 
        //     System.out.print("Enter your number: ");
        //     int a=sc.nextInt();
        //     if(a%10==0){
        //         break;

        //     }
        //     System.out.println(a);



            
        // } while (true);

        // print all the numbers except multiple of 10

        // do { 
        //     System.out.println("Enter your number: ");
        //     int n=sc.nextInt();

        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println("number was: " +n);

            
        // } while (true);

        //Check Prime Number

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // boolean isPrime=true;

        // for(int i=2; i<=n-1; i++){
        //     if(n%i==0){
        //         isPrime=false;

        //     }
        // }
        // if(isPrime==true){
        //     System.out.println("n is prime");
        // }else{
        //     System.out.println("n is not prime");
        // }

    //  Scanner sc=new Scanner(System.in);
    //  int x=sc.nextInt();
    //  if(x==2){
    //     System.out.println("n is prime");

    //  }else{
    //     boolean isPrime=true;
    //     for(int i=2; i<=Math.sqrt(x); i++){
    //         if(x%i==0){   // n is a multiple of i (i not equal to a or n)
    //         isPrime=false;

    //         }
    //     }
    //     if(isPrime==true){
    //         System.out.println("n is prime");
    //     }else{
    //         System.out.println("n is not prime");
    //     }
    //  }
    
    //  for(int line=1;line<=4;line++){
    //     for(int star=1;star<=line;star++){
    //         System.out.print("*");
    //     }

    //     System.out.println();
    //  }


    // int n=5;

    // for(int line=1; line<=n; line++){

    //     // numbers print

    //     for(int number=1; number<=line; number++){
    //         System.out.print(number);
    //     }
    //     System.out.println();
    // }
    

    int n=4;

    char ch='A';

    //outer loop
    for(int line=1;line<=n;line++){

        //line loop

        for(int chars=1; chars<=line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }

    }
}

