package graph.data;

public class Node<T> {
     public T value;
     public Node next ;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String string = "";
        string+=value;
        return string;
    }
}
