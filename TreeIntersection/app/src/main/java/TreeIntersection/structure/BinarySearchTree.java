package TreeIntersection.structure;

import TreeIntersection.data.BTNode;

import java.util.ArrayList;

public class BinarySearchTree {

    BTNode root;

    Boolean isEmptyTree (){
        return root == null;
    }
    public BTNode getRoot() {
        return root;
    }
    public void add (int val ){
        if(isEmptyTree())
        {
            root = new BTNode(val);
        }
        else
        {
            add( val ,root);
        }
    }
    void add (int val ,BTNode root){
        if(val<root.getValue()){
            if(root.getLeft()!=null)
                add(val, root.getLeft());
            else {
                BTNode btNode = new BTNode(val);
                root.setLeft(btNode);
            }
        }
        if(val>root.getValue()){
            if(root.getRight()!=null)
                add(val , root.getRight());
            else{
                BTNode btNode = new BTNode(val);
                root.setRight(btNode);
            }
        }

    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> preOrder( BTNode root )
    {

        if(root==null)
            return list;

        list.add(root.getValue());

        preOrder(root.getLeft());

        preOrder(root.getRight());

        return list;
    }



}
