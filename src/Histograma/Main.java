package Histograma;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] data = {4,2,6,4,9,8,0,1,2,6,3,7,8,5};
        HistogramGenerator hist = new HistogramGenerator(data);
        Map<Integer,Integer> histogram = hist.getHistogram();
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+" ===> "+entry.getValue());
        }
        
    }
    
}
