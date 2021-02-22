package generics.multipletypeparameterclass;

public class Utils<K,V> {
    public K key;
    public V value;
    public Utils(K key, V value) {
        this.key = key;
        this.value = value;
        System.out.println("key:::: "+this.key);
        System.out.println("Value:::: "+this.value);
    }
}
