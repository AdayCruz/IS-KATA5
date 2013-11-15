package kata5;

public class HistogramBuilder<T> {
    
    public Histogram<T> build(T[] items){
        Histogram<T> histogram = new Histogram<>();
        for (T item : items) {
            histogram.put(item, histogram.get(item) + 1);
        }
        return histogram;
    }
        
}
