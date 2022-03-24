/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static stack.and.queue.Stack.validateBrackets;

class AppTest {

//    Can successfully push onto a stack
    @Test
    void pushToStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        String expectedStack ="{1}";
        assertEquals(expectedStack,stack.toString());
    }
//    Can successfully push multiple values onto a stack
    @Test
    void pushMultipleToStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        String expectedStack ="{3 , 2 , 1}";
        assertEquals(expectedStack,stack.toString());
    }
//    Can successfully pop off the stack
    @Test
    void popStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        String expectedStack ="{3}";
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
        java.util.Stack<Integer> expectedStack =new java.util.Stack<Integer>();
        assertEquals(expectedStack.toString(),stack.toString());
    }
//    Can successfully peek the next item on the stack
    @Test
    void peekStack (){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Node<Integer> node = new Node<>(3);
        assertEquals(node.value,stack.peek().value);
    }
//    Can successfully instantiate an empty stack
@Test
    void  instantiateEmptyStack (){
        Stack <Integer> stack = new Stack<>();
        java.util.Stack<Integer> expectedStack =new java.util.Stack<Integer>();
        assertEquals(expectedStack.toString(),stack.toString());
    }
//    Calling pop or peek on empty stack raises exception
//    @Test
//    void  peekExceptionStack (){
//        Stack <Integer> stack = new Stack<>();
//        java.util.Stack<Integer> expectedStack =new java.util.Stack<Integer>();
//
//        assertEquals(expectedStack.peek(),stack.peek());
//    }
//    @Test
//    void  popExceptionStack (){
//        Stack <Integer> stack = new Stack<>();
//        java.util.Stack<Integer> expectedStack =new java.util.Stack<Integer>();
//        assertEquals(expectedStack.pop(),stack.pop());
//    }
//------------------------------------------------------------------------------
//    Can successfully enqueue into a queue
    @Test
    void enqueueIntoQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        String expectedQueue ="{1}";
        assertEquals(expectedQueue,queue.toString());
    }
//    Can successfully enqueue multiple values into a queue
    @Test
    void enqueueMultipleIntoQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        String expectedQueue ="{1 , 2}";
        assertEquals(expectedQueue,queue.toString());
    }
//    Can successfully dequeue out of a queue the expected value
    @Test
    void dequeueQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        Node expectedQueue = new Node(1);
        assertEquals(expectedQueue.value,queue.dequeue().value);
    }
//    Can successfully peek into a queue, seeing the expected value
    @Test
    void peekQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        Node<Integer> expectedQueue = new Node<>(1);
        assertEquals(expectedQueue.value,queue.peek().value);
    }
//    Can successfully empty a queue after multiple dequeues
    @Test
    void dequeueUntilEmptyQueue (){
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        Queue <Integer> expectedQueue = new Queue<>();

        assertEquals(expectedQueue.toString(),queue.toString());
    }
//    Can successfully instantiate an empty queue
    @Test
    void instantiateEmptyQueue ()
    {
        Queue <Integer> queue = new Queue<>();
        Queue <Integer> expectedQueue = new Queue<>();
        assertEquals(expectedQueue.toString(),queue.toString());
    }
//    Calling dequeue or peek on empty queue raises exception
//@Test
//void  peekExceptionQueue (){
//    Queue <Integer> queue = new Queue<>();
//    String expectedQueue ="your queue is empty";
//    assertEquals(expectedQueue,queue.peek());
//}
//    @Test
//    void  dequeueExceptionQueue (){
//        Queue <Integer> queue = new Queue<>();
//        String expectedQueue ="your queue is empty";
//        assertEquals(expectedQueue,queue.dequeue());
//    }
// -----------------------------------------------------
    @Test
    void enqueuePQTest (){
        PseudoQueue<Integer> pQ = new PseudoQueue<Integer>();
        pQ.enqueue(1);
        pQ.enqueue(2);
        pQ.enqueue(3);
        Queue <Integer> expectedQueue = new Queue<>();
        expectedQueue.enqueue(1);
        expectedQueue.enqueue(2);
        expectedQueue.enqueue(3);
        assertEquals(expectedQueue.toString() , pQ.toString());
    }
    @Test
    void dequeuePQTest(){
        PseudoQueue<Integer> pQ = new PseudoQueue<Integer>();
        pQ.enqueue(1);
        pQ.enqueue(2);
        pQ.enqueue(3);
        pQ.dequeue();
        pQ.dequeue();
        Queue <Integer> expectedQueue = new Queue<>();
        expectedQueue.enqueue(1);
        expectedQueue.enqueue(2);
        expectedQueue.enqueue(3);
        expectedQueue.dequeue();
        expectedQueue.dequeue();
        assertEquals(expectedQueue.toString() , pQ.toString());
    }
    @Test
    void createPQTest(){
        PseudoQueue<Integer> pQ = new PseudoQueue<Integer>();
        Queue <Integer> expectedQueue = new Queue<>();
        assertEquals(expectedQueue.toString() , pQ.toString());
    }

    @Test
    void emptyAfterFillPQTest(){
        PseudoQueue<Integer> pQ = new PseudoQueue<Integer>();
        Queue <Integer> expectedQueue = new Queue<>();
        pQ.enqueue(1);
        pQ.enqueue(2);
        pQ.enqueue(3);
        pQ.dequeue();
        pQ.dequeue();
        pQ.dequeue();

        assertEquals(expectedQueue.toString() , pQ.toString());
    }
//----------------------------------------------------------------------
    @Test
    void createAnimalShelterTest(){
        AnimalShelter<Animal> shelter1 = new AnimalShelter<>();
        Queue <Integer> expectedQueue = new Queue<>();
        assertNotNull(shelter1.toString());
    }

    @Test
    void enqueueCatsAndDogsTest (){
        AnimalShelter<Animal> shelter1 = new AnimalShelter<>();
        shelter1.enqueue(new Animal("dog"));
        shelter1.enqueue(new Animal("cat"));
        shelter1.enqueue(new Animal("cat"));
        String expectedString = "AnimalShelter{animalQueue={dog , cat , cat}}";

        assertEquals(expectedString,shelter1.toString());
    }

    @Test
    void dequeueCatsAndDogsTest1 (){
        AnimalShelter<Animal> shelter1 = new AnimalShelter<>();
        shelter1.enqueue(new Animal("dog"));
        shelter1.enqueue(new Animal("cat"));
        shelter1.enqueue(new Animal("cat"));
        String expectedString = "dog";

        assertEquals(expectedString,shelter1.dequeue("dog").toString());
    }

    @Test
    void dequeueCatsAndDogsTest2 (){
        AnimalShelter<Animal> shelter1 = new AnimalShelter<>();
        shelter1.enqueue(new Animal("cat"));
        shelter1.enqueue(new Animal("dog"));
        shelter1.enqueue(new Animal("cat"));
        String expectedString = "dog";

        assertEquals(expectedString,shelter1.dequeue("dog").toString());
    }

    @Test
    void dequeueCatsAndDogsTest3 (){
        AnimalShelter<Animal> shelter1 = new AnimalShelter<>();
        shelter1.enqueue(new Animal("cat"));
        shelter1.enqueue(new Animal("cat"));
        shelter1.enqueue(new Animal("dog"));

        String expectedString = "dog";

        assertEquals(expectedString,shelter1.dequeue("dog").toString());
    }
    //----------------------------------------------------------
    @Test
    void validateBracketsTest1 ()
    {
        String test = "{}()[]";
        boolean expected = true;
        assertEquals(expected,validateBrackets(test));
    }

    @Test
    void validateBracketsTest2 ()
    {
        String test = "{{([])}}([)[]]";
        boolean expected = false;
        assertEquals(expected,validateBrackets(test));
    }

    @Test
    void validateBracketsTest3 ()
    {
        String test = "()[[Extra Characters]]";
        boolean expected = true;
        assertEquals(expected,validateBrackets(test));
    }
    @Test
    void validateBracketsTest4 ()
    {
        String test = "[({}]";
        boolean expected = false;
        assertEquals(expected,validateBrackets(test));
    }
        @Test
    void validateBracketsTest5 ()
    {
        String test = "[";
        boolean expected = false;
        assertEquals(expected,validateBrackets(test));
    }
        @Test
    void validateBracketsTest6 ()
    {
        String test = "{(})";
        boolean expected = false;
        assertEquals(expected,validateBrackets(test));
    }
        @Test
    void validateBracketsTest7 ()
    {
        String test = "";
        boolean expected = true;
        assertEquals(expected,validateBrackets(test));
    }

}
