package TreeIntersection.structure;


import TreeIntersection.data.HashNode;

import java.util.ArrayList;
import java.util.Objects;

public class HashMap <K,V> {

    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        for (int i = 0; i < buckets; i++) {
            bucketArray.add(null);
        }
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    // here we create a unique array index
    private int hash(K key) {
        int hashcode = hashCode(key);
        int index = hashcode % buckets;

        if (index < 0) {
            index *= -1;
        }
        return index;
    }
    public ArrayList<K> keys (){

        ArrayList<K> keys =  new ArrayList<>();
        for (int i=0 ; i< buckets;i++)
        {
            if (bucketArray.get(i)!=null)
            {
                HashNode<K, V> node = bucketArray.get(i);
                keys.add(node.getKey());
                while(node.getNext()!=null){
                    node =node.getNext();
                    keys.add(node.getKey());
                }

            }
        }
        return keys;
    }

    //returns the value of the key
    public V get (K key){
        int index = hash(key);
        HashNode<K, V> head = bucketArray.get(index);
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return head.getValue();
            }
            head = head.getNext();
        }
        return null;
    }

    public boolean contains (K key){
        int index = hash(key);
        HashNode<K, V> head = bucketArray.get(index);
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }


    public void set(K key, V value) {

        int index = hash(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);


        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {

            while (head != null) {
                if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                    head.setValue(value);
                    return;
                }
                head = head.getNext();
            }
            head = bucketArray.get(index);
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }


    @Override
    public String toString() {
        return "HashMap{" +
                "bucketArray=" + bucketArray +
                '}';
    }
}
