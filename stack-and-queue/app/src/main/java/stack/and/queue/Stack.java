package stack.and.queue;

import java.util.EmptyStackException;
import java.util.HashMap;
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

    public static boolean  validateBrackets (String bracketsString){
        if(bracketsString.length()==0)
            return true;

        Stack<Character> stack = new Stack<Character>();


        int j  ;
        for (j=0; j<bracketsString.length();j++)
            if(bracketsString.charAt(j)=='{'||bracketsString.charAt(j)=='('||bracketsString.charAt(j)=='[')
            {
                stack.push(bracketsString.charAt(j));
                break;
            }
        else
            if(bracketsString.charAt(j)=='}'||bracketsString.charAt(j)==')'||bracketsString.charAt(j)==']') //very first char must be an opening
                return false;

        for(int i=j+1;i<bracketsString.length();i++){

            if(bracketsString.charAt(i)=='}') // }
            {
                if(stack.peek().value=='{')
                    stack.pop();
                else
                    return false;
            }
            else
            if(bracketsString.charAt(i)==')') // )
            {
                if(stack.peek().value=='(')
                    stack.pop();
                else
                    return false;
            }
            else
            if(bracketsString.charAt(i)==']')  // ]
            {
                if(stack.peek().value=='[')
                    stack.pop();
                else
                    return false;
            }
            else if(bracketsString.charAt(i)=='(' || bracketsString.charAt(i)=='{'||bracketsString.charAt(i)=='[')
                stack.push(bracketsString.charAt(i)); // (  {  [
            // otherwise if it was another char it will be ignored
        }
        // if the stack is not empty then we have something wrong (probably openings with no closings) so will be false
        //if it was empty then all openings were popped with their closings then it is true
        return stack.isEmpty();
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
