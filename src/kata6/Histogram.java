
package kata6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Histogram<T> {
    
    private final Map<T,Integer> map = new HashMap<>();
    
    public Histogram(Iterator<T> iterator){
        while (iterator.hasNext()) add(iterator.next());
    }
    
    public Histogram(Iterable<T> iterable){
        this(iterable.iterator());
    }

    private void add(T item) {
        map.put(item, get(item)+1);
        
    }

    private int get(T item) {
        return map.containsKey(item) ? map.get(item) : 0;
    }
    
}
