/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;


import hashtable.structure.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static hashtable.App.HashmapRepeatedWord;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void HashMapTesting() {
        HashMap <String , String > testHashMap = new HashMap<>();
        testHashMap.set("Jordan","Amman");
        testHashMap.set("Egypt","Cairo");

        assertEquals("Amman",testHashMap.get("Jordan"));
    }
    @Test void HashMapTestingEditingValue() {
        HashMap <String , String > testHashMap = new HashMap<>();
        testHashMap.set("Jordan","Irbid");
        testHashMap.set("Jordan","Amman");
        testHashMap.set("Egypt","Cairo");

        assertEquals("Amman",testHashMap.get("Jordan"));
    }
//   4.Successfully returns a list of all unique keys that exist in the hashtable
    @Test void HashMapTestingKeys() {
        HashMap <String , String > testHashMap = new HashMap<>();
        testHashMap.set("Jordan","Irbid");
        testHashMap.set("Jordan","Amman");
        testHashMap.set("Egypt","Cairo");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Jordan");
        expected.add("Egypt");

        assertEquals(expected,testHashMap.keys());
    }

@Test void HashMapTestingNull() {
    HashMap <String , String > testHashMap = new HashMap<>();
    testHashMap.set("Jordan","Irbid");
    testHashMap.set("Jordan","Amman");
    testHashMap.set("Egypt","Cairo");

    assertEquals(null,testHashMap.get("Syria"));
}
//Successfully handle a collision within the hashtable
    @Test void HashMapTestingIll() {
        HashMap <String , Integer > testHashMap = new HashMap<>();
        testHashMap.set("Palestine",1);
        testHashMap.set("Jordan",2);
        testHashMap.set("Egypt",2);
        testHashMap.set("Syria",3);
        testHashMap.set("Lebanon",4);
        testHashMap.set("Morocco",5);
        testHashMap.set("Libya",6);
        testHashMap.set("Algeria",7);
        testHashMap.set("Tunisia",8);
        testHashMap.set("Turkish",9);
        testHashMap.set("Italy",18);
        testHashMap.set("France",28);

        assertEquals(12 , testHashMap.getSize());
    }

    @Test
    void repeatedWordsTest1 (){
        String testingStr = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        assertEquals(expected,HashmapRepeatedWord(testingStr));
    }

    @Test
    void repeatedWordsTest2 (){
        String testingStr = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String expected = "it";
        assertEquals(expected,HashmapRepeatedWord(testingStr));
    }

    @Test
    void repeatedWordsTest3 (){
        String testingStr = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..";
        String expected = "summer";
        assertEquals(expected,HashmapRepeatedWord(testingStr));
    }

    @Test
    void EmptyStringTest (){
        String testingStr = "";
        String expected = "no repeated words available";
        assertEquals(expected,HashmapRepeatedWord(testingStr));
    }

    @Test
    void NoRepeatedWordsStringTest (){
        String testingStr = "No Repeated Words";
        String expected = "no repeated words available";
        assertEquals(expected,HashmapRepeatedWord(testingStr));
    }



}
