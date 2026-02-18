//import java.util.ArrayList;
import java.util.*;

public class ArrayListPractice{


// public static int storeWater(ArrayList<Integer> height){
//     int maxWater=0;
//     //brute force

//     for(int i=0;i<height.size(); i++){
//         for(int j=i+1; j<height.size(); j++){
//             int  ht=Math.min(height.get(i), height.get(j));
//             int width=j-i;
//             int currWater=ht*width;
//             maxWater =Math.max(maxWater, currWater);
//         }
//     }
//     return maxWater;
// }

//two pointer approach
public static int Storewater(ArrayList<Integer> height){
    int maxWater=0;
    int lp=0;
    int rp=height.size()-1;

    while(lp<rp){
        //calculate water area

        int ht=Math.min(height.get(lp), height.get(rp));
        int width=rp-lp;
        int currWater=ht*width;
    

        maxWater=Math.max(maxWater,currWater);

        //update ptr
        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;

        }
    }
    return maxWater;

}

//PairSum1
//Brute Force method
//  public static boolean pairSum1(ArrayList<Integer> list, int target){

//     for(int i=0;i<list.size(); i++){
//         for(int j=i+1; j<list.size(); j++){
//             if(list.get(i)+list.get(j)==target){
//                 return true;
//             }
//         }
//     }
//     return false;
//  }

// public static boolean pairsum(ArrayList<Integer> list, int target){
//     int lp=0;
//     int rp=list.size()-1;
    


//     while(lp!=rp){
//         //case 1
//         if(list.get(lp)+list.get(rp)==target){
//             return true;

//         }

//         //case 2
//         if(list.get(lp)+list.get(rp)<target){
//             lp++;
//         }else{
//             //case 3
//             rp--;
//         }

       
        
        
//     }
//     return false;
// }

      public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){ //breaking point
                bp=-1; 
                break;
            }
        }
        int lp=bp+1; //smallest
        int rp=bp; //largest
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;

            }else{
                //case 3
                rp=(n+rp-1)%n;
            }

        }
        return false;

      }
    public static void main(String args[]){
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // System.out.println(list);
        // Collections.sort(list);  // ascending order
        // System.out.println(list);

        // //descending order

        // Collections.sort(list, Collections.reverseOrder());

        // System.out.println(list);
       

       //Two Dimensional ArrayList

       //ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
      // ArrayList<Integer> list = new ArrayList<>();
    //    list.add(1); list.add(2);
    //    mainList.add(list);

    //    ArrayList<Integer> list2= new ArrayList<>();

    //    list2.add(3); list2.add(4);

    //    mainList.add(list2);

    //    for(int i=0;i<mainList.size(); i++){
    //     ArrayList<Integer> currList= mainList.get(i);
    //     for(int j=0; j<currList.size(); j++){
    //         System.out.print(currList.get(j)+ " ");

    //     }
    //     System.out.println();
    //    }
    //    System.out.println(mainList);
    //ArrayList<Integer> height = new ArrayList<>();

        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        
        // height.add(8);
        // height.add(3);
        // height.add(7);

        //System.out.println(Storewater(height));
       ArrayList<Integer>list=new ArrayList<>();
    //    list.add(1);
    //    list.add(2);
    //    list.add(3);
    //    list.add(4);
    //    list.add(5);
    //    list.add(6);
    //    int target=10;
    //    System.out.println(pairsum(list, target));

    //11, 15,6,8,9,10-Sorted & Rotated

    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target=16;
    System.out.println(pairSum2(list,target));







    }
}