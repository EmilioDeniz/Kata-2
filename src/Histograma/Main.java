package Histograma;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] data = {4,2,6,4,9,8,0,1,2,6,3,7,8,5};
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);

        }
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+" ===> "+entry.getValue());
        }
        
    }
    
}
