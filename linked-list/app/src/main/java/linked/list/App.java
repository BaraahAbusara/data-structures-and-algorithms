/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {
    public static void main(String[] args) {

        linkedList <Integer> myFirstList = new linkedList<Integer>();

        myFirstList.insert(1);
        myFirstList.insert(2);
        myFirstList.insert(3);
        myFirstList.insert(4);
        myFirstList.insert(5);
        System.out.println(myFirstList);
        myFirstList.append(0);
        System.out.println("This list includes number 5 ? "+myFirstList.includes(5));
        System.out.println("This list includes number 6 ? "+myFirstList.includes(6));
        System.out.println(myFirstList.toString());
        myFirstList.insertAfter(5,6);
        System.out.println("This list includes number 6 ? "+myFirstList.includes(6));
        System.out.println(myFirstList.toString());

        myFirstList.insertAfter(1,7);
        myFirstList.insertBefore(null,8);

        myFirstList.deleteValue(11);
        System.out.println(myFirstList.toString());



    }
}
