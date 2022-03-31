package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<Double> {
    List<java.lang.Double> list = new ArrayList<>();

    List<java.lang.Double> preOrder(BTNode root , boolean flag )
    {
        if(flag){
            list.clear();
            flag=false;

            if(root==null)
                return list;
        }

        list.add(root.value);
//        System.out.println(root.value);

        if(root.left!=null){
            preOrder(root.left, false);
        }
        if(root.right!=null){
            preOrder(root.right, false);
        }
        return list;
    }
    List<java.lang.Double> inOrder (BTNode <Double> root , boolean flag){

        if(flag){
            list.clear();
            flag=false;
            if(root==null)
                return list;

        }

        if(root.left!=null){
            inOrder(root.left,false);
        }
        list.add(root.value);
//        System.out.println(root.value);
        if(root.right!=null){
            inOrder(root.right,false);
        }
        return list;

    }

    List<java.lang.Double> postOrder (BTNode<Double> root, boolean flag){
        if(flag){
            list.clear();
            flag=false;

            if(root==null)
                return list;
        }

        if(root.left!=null)
        {
            postOrder(root.left,false);
        }
        if(root.right!=null){
            postOrder(root.right,false);
        }
        list.add(root.value);
        return list;

//        System.out.println(root.value);
    }

    double treeMax (BTNode<Double> root){
        if(root==null)
            return 0 ;

        double maxVal =0 ;
        List <java.lang.Double> list = inOrder(root,true);
        for (int i=0 ; i<list.size();i++)
        {
            if(list.get(i)>maxVal)
                maxVal=list.get(i);
        }
        return maxVal ;

    }

}
