
import java.util.*;

public class LinkedHashM{

      //Finding Itinerary for tickets

        public static String getStart(HashMap<String, String> tickets){
            HashMap<String, String> revMap=new HashMap<>();

            for(String key: tickets.keySet()){
                revMap.put(tickets.get(key),key);
            }
            for(String key: tickets.keySet()){
                if(!revMap.containsKey(key)){
                    return key;
                }
            }

            return null;
        }

    public static void main(String args[]){
        // LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("China", 150);
        // lhm.put("US", 50);

        // System.out.println(lhm);

        // TreeMap<String, Integer> tm=new TreeMap<>();
        // tm.put("India", 100);
        // tm.put("China", 150);
        // tm.put("US", 50);
        // tm.put("Indonesia", 6);

        // System.out.println(tm);

        //Majority Element

        // int arr[]={1,3,2,5,1,3,1,5,1};
        // HashMap<Integer, Integer> map= new HashMap<>();

        // for(int i=0;i<arr.length; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }else{
        //         map.put(arr[i],1);
        //     }
        // }

        // Set<Integer> keySet=map.keySet();
        // for(Integer key: keySet){
        //     if(map.get(key)>arr.length/3){
        //         System.out.println(key);
        //     }
        // }

        //HashSet
        // HashSet<Integer>set=new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);
        // System.out.println(set);


        // //LinkedHashSet

        // HashSet<String> cities=new HashSet<>();
        // cities.add("Delhi");
        // cities.add("Mumbai");
        // cities.add("Noida");
        // cities.add("Bengaluru");
        // System.out.println(cities); //print in random order

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs); //print output as same as insertion

        lhs.remove("Delhi");
        System.out.println(lhs);


        //TreeSet -->Sorted in ascending order
        //NULL values are NOT allowed

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts); //print output in sorted order

        // Count Distinct Elements

        //num={4,3,2,6,7,3,4,2,1} ans=7

        // int num[]={4,3,2,5,6,7,3,4,2,1};
        // HashSet<Integer> set=new HashSet<>(); 

        // for(int i=0;i<num.length; i++){ // O(n)
        //     set.add(num[i]);
        // }
        // System.out.println("ans = "+ set.size());


        //Union & Intesection of two arrays

        int arr1[]= {7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();

        //Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("union = "+set.size());

        //intersection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);

        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);

            }
        }
        System.out.println("intersection = "+count);

        //Finding Itinerary for tickets
        HashMap<String, String> tickets=new HashMap<>(); //O(n)
        tickets.put("Chennai", "Bengaluru");
        tickets.put("mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print(" -> "+ tickets.get(start));
            start=tickets.get(start);

        }
        System.out.println();

        // Largest Subarray with Sum 0

        int array[]={15, -2, 2, -8, 1 ,7,10,23};

       // HashMap<Integer, Integer> map=new HashMap<>(); // O(n)
        //(sum, idx)

        // int sum=0;
        // int len=0;

        // for(int j=0;j<array.length; j++){
        //     sum+=array[j];
        //     if(map.containsKey(sum)){
        //         len=Math.max(len, j-map.get(sum));
        //     }else{
        //         map.put(sum, j);
        //     }
        // }
        // System.out.println("largest subrarray with 0 sum is -> "+len);

        //SubArray SUm Equal to K

        int array1[]={10, 2, -2, -20, 10};
        int k=-10;

        HashMap<Integer, Integer> mp=new HashMap<>();
        //(sum, count)
        mp.put( 0, 1);

        int sm=0;
        int ans=0;

        for(int j=0;j<arr1.length;j++){
            sm+=array1[j]; //sum(j)
            if(mp.containsKey(sm-k)){
                ans+=mp.get(sm-k);
            }
            mp.put(sm, mp.getOrDefault(sm, 0)+1);

        }

        System.out.println(ans);




    }
}