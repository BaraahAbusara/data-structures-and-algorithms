/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

//    Can successfully push onto a stack
    @Test
    void pushToStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        String expectedStack ="Stack{top=Node{value=1}}";
        assertEquals(expectedStack,stack.toString());
    }
//    Can successfully push multiple values onto a stack
    @Test
    void pushMultipleToStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        String expectedStack ="Stack{top=Node{value=3}}";
        assertEquals(expectedStack,stack.toString());
    }
//    Can successfully pop off the stack
    @Test
    void popStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        String expectedStack ="Node{value=3}";
        assertEquals(expectedStack,stack.pop());
    }
//    Can successfully empty a stack after multiple pops
    @Test
    void popStackUntilEmpty (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        String expectedStack ="Stack{top=null}";
        assertEquals(expectedStack,stack.toString());
    }
//    Can successfully peek the next item on the stack
    @Test
    void peekStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        String expectedStack ="Node{value=3}";
        assertEquals(expectedStack,stack.peek());
    }
//    Can successfully instantiate an empty stack
@Test
    void  instantiateEmptyStack (){
        Stack <Integer> stack = new Stack<>();
        String expectedStack ="Stack{top=null}";
        assertEquals(expectedStack,stack.toString());
    }
//    Calling pop or peek on empty stack raises exception
    @Test
    void  peekExceptionStack (){
        Stack <Integer> stack = new Stack<>();
        String expectedStack ="your stack is empty";
        assertEquals(expectedStack,stack.peek());
    }
    @Test
    void  popExceptionStack (){
        Stack <Integer> stack = new Stack<>();
        String expectedStack ="your stack is empty";
        assertEquals(expectedStack,stack.pop());
    }

//    Can successfully enqueue into a queue
    @Test
    void enqueueIntoQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        String expectedStack ="Queue{front=Node{value=1}, back=Node{value=1}}";
        assertEquals(expectedStack,queue.toString());
    }
//    Can successfully enqueue multiple values into a queue
    @Test
    void enqueueMultipleIntoQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        String expectedStack ="Queue{front=Node{value=1}, back=Node{value=2}}";
        assertEquals(expectedStack,queue.toString());
    }
//    Can successfully dequeue out of a queue the expected value
    @Test
    void dequeueQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        String expectedStack ="Node{value=1}";
        assertEquals(expectedStack,queue.dequeue());
    }
//    Can successfully peek into a queue, seeing the expected value
    @Test
    void peekQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        String expectedStack ="Node{value=1}";
        assertEquals(expectedStack,queue.peek());
    }
//    Can successfully empty a queue after multiple dequeues
    @Test
    void dequeueUntilEmptyQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        String expectedStack ="Queue{front=null, back=null}";
        assertEquals(expectedStack,queue.toString());
    }
//    Can successfully instantiate an empty queue
    @Test
    void instantiateEmptyQueue ()
    {
        Queue <Integer> queue = new Queue<>();
        String expectedStack ="Queue{front=null, back=null}";
        assertEquals(expectedStack,queue.toString());
    }
//    Calling dequeue or peek on empty queue raises exception
@Test
void  peekExceptionQueue (){
    Queue <Integer> queue = new Queue<>();
    String expectedStack ="your queue is empty";
    assertEquals(expectedStack,queue.peek());
}
    @Test
    void  dequeueExceptionQueue (){
        Queue <Integer> queue = new Queue<>();
        String expectedStack ="your queue is empty";
        assertEquals(expectedStack,queue.dequeue());
    }

}
