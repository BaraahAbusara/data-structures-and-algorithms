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

    public String dequeue () {
        if(stack1.isEmpty())
        {
            return "your queue is empty";
        }
        while (stack1.top!=null) //reverse in another stack to pop the last element (will be the first)
        {
            stack2.push((T) String.valueOf(stack1.pop()));
        }
        String string = stack2.pop();
        if(stack2.isEmpty())
        {
            stack1=stack2;
            return "your queue is now empty";
        }
        while (stack2.top!=null){   // reverse the stack again to its normal situation
            stack1.push((T) String.valueOf(stack2.pop()));
        }
        return string;
    }

    @Override
    public String toString() {
        String string = "";
        Stack<T> stackCopy = stack1;
        while(!stackCopy.isEmpty())
        {
            stack2.push((T) String.valueOf(stackCopy.pop()));
        }
        while(!stack2.isEmpty())
        {
            string+=stack2.pop()+" ";
        }
        return string;
    }
}





