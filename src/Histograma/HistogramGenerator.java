package Histograma;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    private final T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
    }

    public T[] getData() {
     return this.data;
    } 
    
    public Map<T,Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap<T,Integer>(); 
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
