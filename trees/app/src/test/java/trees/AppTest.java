/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testingTreeConstructor() {
        BinarySearchTree BST = new BinarySearchTree();
        assertNotNull(BST);
    }

    @Test void testingTreeOnlyWithRoot (){
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        assertEquals(BST.inOrder(BST.root,true),list);
    }

    @Test void testingAddingLeftAndRight (){ //can add a left and a right node and returns an array using inOrder
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(0);

        ArrayList<Double> list = new ArrayList<>();
        list.add(0.0);
        list.add(1.0);
        list.add(2.0);
        assertEquals(BST.inOrder(BST.root,true),list);
    }

    @Test void testingPreOrder (){ //can add a left and a right node and returns an array using preOrder
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(0);

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(0.0);
        list.add(2.0);
        assertEquals(BST.preOrder(BST.root,true),list);
    }
    @Test void testingPostOrder(){ //can add a left and a right node and returns an array using postOrder
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(0);

        ArrayList<Double> list = new ArrayList<>();
        list.add(0.0);
        list.add(2.0);
        list.add(1.0);
        assertEquals(BST.postOrder(BST.root,true),list);
    }
    @Test void testingContainsTrue (){
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(0);

        assertEquals(BST.contains(2),true);
    }
    @Test void testingContainsFalse (){
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(0);

        assertEquals(BST.contains(5),false);
    }
}
