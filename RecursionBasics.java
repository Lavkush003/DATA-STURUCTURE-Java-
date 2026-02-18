
public class RecursionBasics {

    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }


//Factorial 

public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fnm1=fact(n-1);
    int fn=n*fact(n-1);
    return fn;
}

//Sum of n natural numbers

public static int calcSum(int n){
    if(n==1)
{
    return 1;

}
int Snm1=calcSum(n-1);
int Sn=n+Snm1;
return Sn;

}

//Calculate nth term in fibonacci

public static int fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fn=fnm1+fnm2;
    return fn;
}

// find first occurence or array element

public static int firstOccurence(int arr[], int key, int i){
    if(i==arr.length){
        return i;

    }
    return firstOccurence(arr, key, i+1);
}

// x to the power n
public static int power(int x, int n){
    if(n==0){
        return 1;
    }

    return x* power(x, n-1);
}

// tiling Problems

public static int tilingProblem(int x){  // 2 x n (floor size)
   //base case
    if(x==0 || x==1){
        return 1;
    }

    //kaam
    //vertical choice

    int Snm1=tilingProblem(x-1);

    //horizontal choice

    int Snm2=tilingProblem(x-2);

    int totWays= Snm1+Snm2;
    return totWays;


}
    public static void main(String args[]){

       // int n=5;
       // printDec(n);

        //System.out.println( fact(n));
       // System.out.println(calcSum(n));
        //System.out.println(fib(n));
        //int arr[] ={8, 3,6, 9, 5, 10, 2,5,3};

       // System.out.println(firstOccurence(arr, 9, 0));
       // System.out.println(power(2,10));
        System.out.println(tilingProblem(4));


    }
}