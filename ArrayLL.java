
import java.util.ArrayList;

//import java.util.*;
public class ArrayLL{

    public static void main(String args[]){
        //Java Collection Framework

        //Syntax
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>(); //<>--defines data type
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
       

       //add elements
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //list.add(1,9); //O(n) --> adding element 9 at index 1
        //System.out.println(list);
        System.out.println(list.size());

        //get operation

        // int element = list.get(2);
        //  System.out.println(element);

         
         //delete
        //  list.remove(2);
        //  System.out.println(list);

         //Set Operation

        //  list.set(2,10);
        //  System.out.println(list);

        //Contains

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

     //print the arraylist
      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) +" ");
      }
      System.out.println();

      //Reverse print
      for(int i=list.size()-1; i>=0;i--){
        System.out.print(list.get(i) + " ");

      }
      System.out.println();

      //max element 

      int max=Integer.MIN_VALUE;

      for(int i=0; i<list.size(); i++){
        if(max<list.get(i)){
          max=list.get(i);
        }
      }
      System.out.println("max element ="+ max);

    }
}