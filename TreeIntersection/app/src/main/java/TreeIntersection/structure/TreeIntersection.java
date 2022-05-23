package TreeIntersection.structure;

import TreeIntersection.data.BTNode;

import java.util.ArrayList;

public class TreeIntersection {
    HashMap<Integer,Integer> foundInTree1 = new HashMap<>();


    public TreeIntersection() {
    }

    void addToMap( BTNode root )
    {

        if(root==null)
            return ;

        if(foundInTree1.get(root.getValue())!=null)
            foundInTree1.set(root.getValue(),foundInTree1.get(root.getValue())+1);
        else
            foundInTree1.set(root.getValue(),1);


        addToMap(root.getLeft());

        addToMap(root.getRight());

        return ;
    }

    ArrayList<Integer> findIntersection (BTNode root){

        ArrayList<Integer> ans = new ArrayList<>();

        if(root==null)
            return ans;

        ans.addAll(findIntersection(root.getLeft()));

        ans.addAll(findIntersection(root.getRight()));

        if(foundInTree1.get(root.getValue())>=1)
        {
            ans.add(root.getValue());
            foundInTree1.set(root.getValue(),foundInTree1.get(root.getValue())-1);

        }

        return ans ;

    }

    public ArrayList<Integer> treeIntersection (BinarySearchTree tree1, BinarySearchTree tree2){
        addToMap(tree1.root);

        return findIntersection(tree2.root);
    }

}
