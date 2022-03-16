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
    public String pop ()
    {
        if(!this.isEmpty()){
            Node<T> poppedValue = this.top;
            this.top=this.top.next;
            return poppedValue.toString();
        }else{
            return "your stack is empty";
        }
    }

    public String peek ()
    {
        if(!this.isEmpty())
            return this.top.toString();
        else
            return "your stack is empty";

    }

    public boolean isEmpty(){
        return this.top==null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
