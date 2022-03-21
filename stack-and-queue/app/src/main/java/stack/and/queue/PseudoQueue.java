package stack.and.queue;

public class PseudoQueue<T> {

    Stack <T> stack1;
    Stack <T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<T>();
        this.stack2 = new Stack<T>();
    }

    public void enqueue (T value){
        stack1.push(value);
    }

    public Node<T> dequeue () {
        if(stack1.isEmpty())
        {
            return null;
        }
        while (stack1.top!=null) //reverse in another stack to pop the last element (will be the first)
        {
            stack2.push((T) stack1.pop());
        }
        Node<T> string = stack2.pop();
        if(stack2.isEmpty())
        {
            stack1=stack2;
        }
        while (stack2.top!=null){   // reverse the stack again to its normal situation
            stack1.push((T) stack2.pop());
        }
        return string;
    }

    @Override
    public String toString() {
        try{
            String string = "{" ;
            Stack<T> stackCopy = stack1;
            while (!stackCopy.isEmpty()) {
                stack2.push(stackCopy.pop().value);
            }
            Node<T> pointer = stack2.top;
            while (pointer.next!=null){
                string +=pointer.value+" , ";
                pointer=pointer.next;
            }
            string+=pointer.value+"}";
            return string;

        }catch(NullPointerException err){
            return err.getMessage();
        }
    }
}





