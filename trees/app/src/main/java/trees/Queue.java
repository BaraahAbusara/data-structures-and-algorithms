package trees;

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

    public T dequeue (){
        try {
            if (!this.isEmpty()) {
                Node<T> removedNode = this.front;
                if (this.front == this.back) {
                    this.back = this.back.next;
                }
                this.front = this.front.next;
                return removedNode.value;
            }
        }
        catch (EmptyStackException err){
            System.out.println(err.getMessage());
        }
        return null;
    }

    public T peek (){
        try{
            if (!this.isEmpty())
                return this.front.value;
        }catch (EmptyStackException err){
            System.out.println(err.getMessage());
        }
          return null;
    }

    public boolean isEmpty(){
        return this.front==null;
    }

    @Override
    public String toString() {
        String queueNodes ="";
        queueNodes+='{';
        Node pointer = this.front;
        try
        {
            while (pointer.next != null) {
                queueNodes += pointer.value + " , ";
                pointer = pointer.next;
            }
            queueNodes += pointer.value;
            queueNodes += '}';
        } catch (NullPointerException err)
        {
            return err.getMessage();
        }

        return queueNodes;
    }
}
