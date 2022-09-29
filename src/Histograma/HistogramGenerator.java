package Histograma;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {
    private final Integer[] data;

    public HistogramGenerator(Integer[] data) {
        this.data = data;
    }

    public Integer[] getData() {
     return this.data;
    } 
    
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>(); 
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);

        }
        return histogram;
    }
}
