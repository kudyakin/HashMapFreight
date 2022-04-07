import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BaseFreightHashMap<K, V> implements FreightMap<String, Freight> {

    private Map<String, Freight> map = new HashMap<>();

    public BaseFreightHashMap() { }
    public BaseFreightHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    public boolean put(String key, Freight value) {
        if(isNull(key) || isNull(value)) {
            return false;}
        map.put(key, value);
        return true;
    }

    public boolean remove(String key) {
        if(isNull(key)) { return false; }
        map.remove(key);
        return true;
    }

    public boolean containsKey(String key) {
        if(isNull(key)) { return false; }
        return map.containsKey(key);
    }

    public Freight get(String key) {
        if(isNull(key)) { return null; }
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }

    public Freight[] toArray() {
        return map.values().toArray(new Freight[0]);
    }

    public String toString() {
        return map.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseFreightHashMap)) return false;
        BaseFreightHashMap<?, ?> that = (BaseFreightHashMap<?, ?>) o;
        return Objects.equals(map, that.map);
    }

    public int hashCode() {
        return Objects.hash(map);
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}