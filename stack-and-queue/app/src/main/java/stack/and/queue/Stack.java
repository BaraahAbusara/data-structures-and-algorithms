package stack.and.queue;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top ;

    public Stack() {
    }
    public void push (T newElement){
        Node<T> newNode = new Node<>(newElement);
        newNode.next=this.top;
        this.top=newNode;
    }
    public Node<T> pop ()
    {
        try{
            if (!this.isEmpty()) {
                Node<T> poppedValue = this.top;
                this.top = this.top.next;
                return poppedValue;
            }
        }catch(EmptyStackException err){
            System.out.println(err.getMessage());
        }
        return null ;
    }

    public Node<T> peek ()
    {
        try {
            if (!this.isEmpty())
                return this.top;
        }catch (EmptyStackException err){
            System.out.println(err.getMessage());
        }
        return null;

    }

    public boolean isEmpty(){
        return this.top==null;
    }

    @Override
    public String toString() {
        try{
            String stackNodes = "";
            stackNodes += "{";
            Node pointer = this.top;
            while (pointer.next != null) {
                stackNodes += pointer.value + " , ";
                pointer = pointer.next;
            }
            stackNodes += pointer.value + "}";
            return stackNodes;
        }catch (NullPointerException err){
            return "[]";
        }
    }
}
