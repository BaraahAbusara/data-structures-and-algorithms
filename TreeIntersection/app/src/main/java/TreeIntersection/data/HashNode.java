package TreeIntersection.data;

import java.util.Hashtable;

public class HashNode <K,V> {
    private HashNode <K,V> next ;
    private K key ;
    private V value;
    private Integer hashCode;
    public HashNode( K key, V value,Integer hashCode) {
        this.hashCode = hashCode;
        this.key = key;
        this.value = value;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Integer getHashCode() {
        return hashCode;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
