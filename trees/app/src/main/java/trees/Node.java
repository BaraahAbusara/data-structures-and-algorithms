package trees;

public class Node<T> {
     T value;
     Node next ;

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
