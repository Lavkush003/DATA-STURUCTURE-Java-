
public class PracticeQue{

//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map){
//    //base case

//    if(idx==str.length()) {
//     System.out.println(newStr);
//     return;
//    }

//    //kaam

//    char currChar=str.charAt(idx);
//    if(map[currChar-'a']==true){
//     //duplicate

//     removeDuplicates(str, idx+1, newStr, map);
//    }else {
//     map[currChar-'a']=true;
//     removeDuplicates(str, idx+1, newStr.append(currChar, map);
    
//    }


//     }

public static int friendsPairing(int n){
    //base case
    
    if(n==1 || n==2){
        return n;

    }
    //choice
    //single

    // int fnm1=friendsPairing(n-1);

    // //pair
    // int fnm2=friendsPairing(n-2);
    // int pairWays=(n-1)*fnm2;

    // //totalWays

    // int totalWays=fnm1+pairWays;
    // return totalWays;

    return friendsPairing(n-1) +(n-1)* friendsPairing(n-2);
}

    public static void main(String args[]){


        // String str = "appnnacollege";

        // removeDuplicates(str, 0, StringBuilder(""), new boolean[26]);
        System.out.println(friendsPairing(3));

        

    }
}
