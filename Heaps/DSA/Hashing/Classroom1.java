import java.util.*;

public class Classroom1{

    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm=new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Get- O(1)
        int population=hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //ContainsKey - O(1)

        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false

        //Remove- O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());




    }
}