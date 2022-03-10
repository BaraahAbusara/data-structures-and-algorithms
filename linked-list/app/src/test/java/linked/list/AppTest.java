/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.junit.jupiter.api.Test;

import static linked.list.App.linkedListZip;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    linkedList <Integer> myFirstList = new linkedList<Integer>();

    @Test
    void testLinkedList (){ //creating a linkedList

        assertNotNull(myFirstList);
    }
    @Test
    void testInsertLinkedList (){ //inserting to a linkedList

        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        String expectedAns = "{3}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();
        assertEquals(expectedAns,actualAns);
    }
    @Test
    void testAppendLinkedList1 (){ //appending a value to a linkedList with elements
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.append(0);
        String expectedAns = "{3}->{2}->{1}->{0}->{NULL}";
        String actualAns = myFirstList.toString();
        assertEquals(expectedAns,actualAns);
    }
    @Test
    void testAppendLinkedList2 (){// appending a value to an empty linkedList

        myFirstList.append(0);
        String expectedAns = "{0}->{NULL}";
        String actualAns = myFirstList.toString();
        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testIncludesLinkedList1 (){ // testing includes an existing value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        boolean expectedAns = true;
        boolean actualAns = myFirstList.includes(1);
        assertEquals(expectedAns,actualAns);
    }
    @Test
    void testIncludesLinkedList2 (){ //testing includes a non existing value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        boolean expectedAns = false;
        boolean actualAns = myFirstList.includes(11);
        assertEquals(expectedAns,actualAns);
    }
    @Test
    void testInsertAfterLinkedList1 (){ //inserting after the last value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertAfter(1,10);
        String expectedAns = "{3}->{2}->{1}->{10}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertAfterLinkedList2 (){ //inserting after a middle value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertAfter(2,20);
        String expectedAns = "{3}->{2}->{20}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertAfterLinkedList3 (){ //inserting after the first value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertAfter(3,30);
        String expectedAns = "{3}->{30}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }


    @Test
    void testInsertAfterLinkedList4 (){ //inserting after a non existing value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertAfter(5,50);
        String expectedAns = "{3}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertBeforeLinkedList1 (){ //inserting before the first value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertBefore(3,4);
        String expectedAns = "{4}->{3}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertBeforeLinkedList2 (){ //inserting before the end value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertBefore(1,5);
        String expectedAns = "{3}->{2}->{5}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertBeforeLinkedList3 (){ //inserting before null
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertBefore(null,11);
        String expectedAns = "{3}->{2}->{1}->{11}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testInsertBeforeLinkedList4 (){ //inserting before non existing value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insertBefore(50,11);
        String expectedAns = "{3}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testDeleteLinkedList1 (){ //deleting from the beginning
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.deleteValue(1);
        String expectedAns = "{3}->{2}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }
    @Test
    void testDeleteLinkedList2 (){ //deleting from the middle
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.deleteValue(2);
        String expectedAns = "{3}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testDeleteLinkedList3 (){ //deleting from the end
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.deleteValue(3);
        String expectedAns = "{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }

    @Test
    void testDeleteLinkedList4 (){ //deleting non existing value
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.deleteValue(5);
        String expectedAns = "{3}->{2}->{1}->{NULL}";
        String actualAns = myFirstList.toString();

        assertEquals(expectedAns,actualAns);
    }


    @Test

    void testKthElementLinkedList2  (){ //non existing k (point 1)
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        String expectedAns = "We have no kth element";
        String actualAns = String.valueOf(myFirstList.kthFromEnd(10));

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void testKthElementLinkedList3  (){ //non existing k as of length of the array(point 2)
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        String expectedAns = "We have no kth element";
        String actualAns = String.valueOf(myFirstList.kthFromEnd(3));

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void testKthElementLinkedList4  (){ //k is minus (point 3)
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        String expectedAns = "We have no kth element";
        String actualAns = String.valueOf(myFirstList.kthFromEnd(-1));

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void testKthElementLinkedList5  (){ //linkedList of size 1 (point 4)
        myFirstList.insert(1);

        int expectedAns = 1;
        int actualAns =myFirstList.kthFromEnd(0);

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void testKthElementLinkedList1  (){ //existing k (point 5)
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        int expectedAns = 2;
        int actualAns = myFirstList.kthFromEnd(1);

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void testKthElementLinkedList6  (){ //k is the last element
        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        int expectedAns = 3;
        int actualAns = myFirstList.kthFromEnd(2);

        assertEquals(expectedAns,actualAns);
    }

    @Test

    void  zippedAEqualsB  (){ // same length
        linkedList <Integer> myFirstList = new linkedList<Integer>();
        linkedList <Integer> mySecondList = new linkedList<Integer>();


        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        mySecondList.insert(4);
        mySecondList.insert(5);
        mySecondList.insert(6);
        linkedList <Integer> actualAns = linkedListZip(myFirstList,mySecondList);
        linkedList <Integer> expectedAns = new linkedList<>();
        expectedAns.insert(4);
        expectedAns.insert(1);

        expectedAns.insert(5);
        expectedAns.insert(2);

        expectedAns.insert(6);
        expectedAns.insert(3);

        assertEquals(expectedAns.toString(),actualAns.toString());
    }
    @Test

    void  zippedALessThanB  (){
        linkedList <Integer> myFirstList = new linkedList<Integer>();
        linkedList <Integer> mySecondList = new linkedList<Integer>();


        myFirstList.insert(1);
        mySecondList.insert(4);
        mySecondList.insert(5);
        mySecondList.insert(6);
        linkedList <Integer> actualAns = linkedListZip(myFirstList,mySecondList);
        linkedList <Integer> expectedAns = new linkedList<>();
        expectedAns.insert(4);
        expectedAns.insert(5);
        expectedAns.insert(6);
        expectedAns.insert(1);

        assertEquals(expectedAns.toString(),actualAns.toString());
    }

    @Test

    void  zippedANull  (){
        linkedList <Integer> myFirstList = new linkedList<Integer>();
        linkedList <Integer> mySecondList = new linkedList<Integer>();

        mySecondList.insert(4);
        mySecondList.insert(5);
        mySecondList.insert(6);
        linkedList <Integer> actualAns = linkedListZip(myFirstList,mySecondList);
        linkedList <Integer> expectedAns = new linkedList<>();
        expectedAns.insert(4);
        expectedAns.insert(5);
        expectedAns.insert(6);

        assertEquals(expectedAns.toString(),actualAns.toString());
    }

    @Test

    void  zippedBNull  (){
        linkedList <Integer> myFirstList = new linkedList<Integer>();
        linkedList <Integer> mySecondList = new linkedList<Integer>();


        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);

        linkedList <Integer> actualAns = linkedListZip(myFirstList,mySecondList);
        linkedList <Integer> expectedAns = new linkedList<>();
        expectedAns.insert(1);
        expectedAns.insert(2);
        expectedAns.insert(3);

        assertEquals(expectedAns.toString(),actualAns.toString());
    }

    @Test

    void  zippedAMoreThanB  (){
        linkedList <Integer> myFirstList = new linkedList<Integer>();
        linkedList <Integer> mySecondList = new linkedList<Integer>();


        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        mySecondList.insert(6);
        linkedList <Integer> actualAns = linkedListZip(myFirstList,mySecondList);
        linkedList <Integer> expectedAns = new linkedList<>();
        expectedAns.insert(1);
        expectedAns.insert(2);
        expectedAns.insert(6);
        expectedAns.insert(3);

        assertEquals(expectedAns.toString(),actualAns.toString());
    }
}
