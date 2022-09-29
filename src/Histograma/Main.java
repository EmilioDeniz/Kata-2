package Histograma;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa","Ana"};
        HistogramGenerator hist = new HistogramGenerator(data);
        Map<Integer,Integer> histogram = hist.getHistogram();
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+" ===> "+entry.getValue());
        }
        
    }
    
}
