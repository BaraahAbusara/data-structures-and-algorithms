package stack.and.queue;

import java.util.EmptyStackException;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    public Queue() {

    }
    public void enqueue (T newValue){ //adds a new node with that value to the back of the queue with an O(1) Time performance.
        Node<T> newNode = new Node<>(newValue);

        if(!this.isEmpty())
        {
            this.back.next = newNode;
            this.back = newNode;
        }else
        {
            this.back=newNode;
            this.front=newNode;
        }
    }

    public String dequeue (){
        if(!this.isEmpty()){
            Node<T> removedNode = this.front;
            if(this.front==this.back)
            {
                this.back=this.back.next;
            }
                this.front=this.front.next;
            return removedNode.toString();
        }
        else{
            return "your queue is empty";
        }
    }
    public String peek (){
        if(!this.isEmpty())
            return this.front.toString();
        else
            return "your queue is empty";


    }
    public boolean isEmpty(){
        return this.front==null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}
