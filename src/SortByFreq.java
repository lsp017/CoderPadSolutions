import java.io.*;
import java.util.*;

/*
 * Sort elements by frequency 
Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 99, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5,-1, 6, 99}

 */

public class SortByFreq {
  public static void main(String[] args) {
   
//    int arr[] = {2, 5, 2, 6, -1, 99, 5, 8, 8, 8};
    int arr[] = {2, 5, 2, 8, 5, 6, 8, 8,-10};
    
    List<Integer> list= sortByFrequency(arr);
    System.out.println(list);
  }
  
  public static List<Integer> sortByFrequency(int arr[]){
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new LinkedHashMap<>();
    
    List<Integer> result = new ArrayList<>();
    
    for(int i :arr){
      if(!map.containsKey(i))
        map.put(i,1);
      else
        map.put(i,map.get(i)+1);
    }
    
    List<Map.Entry<Integer,Integer>> sortList = new ArrayList<>(map.entrySet());
    
    Collections.sort(sortList,(o1,o2)-> {Integer i = o1.getValue();
                                          Integer j = o2.getValue();
                                         Integer val = j.compareTo(i); 
                                         if(val==0){
                                      return o1.getKey().compareTo(o2.getKey());
                                         }
                    return j.compareTo(i);});
    

    
    Map<Integer,Integer> resMap = new LinkedHashMap<>();

    for(Map.Entry<Integer,Integer> e : sortList){
      resMap.put(e.getKey(),e.getValue());
      int count = e.getValue();
      while(e.getValue()!=null && count>0 ){
        result.add(e.getKey());
        count--;
      }
    }
    
    resMap.forEach((k,v)->System.out.println(k + " " + v));
      
  
    return result;
  }
  
}
