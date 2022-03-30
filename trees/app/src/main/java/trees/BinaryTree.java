package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<Double> {
    List<java.lang.Double> list = new ArrayList<>();

    List<java.lang.Double> preOrder(BTNode root)
    {
        list.add(root.value);
//        System.out.println(root.value);

        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
        return list;
    }
    List<java.lang.Double> inOrder(BTNode <Double> root){
        if(root.left!=null){
            inOrder(root.left);
        }
        list.add(root.value);
//        System.out.println(root.value);
        if(root.right!=null){
            inOrder(root.right);
        }
        return list;

    }

    List<java.lang.Double> postOrder (BTNode<Double> root){
        if(root.left!=null)
        {
            postOrder(root.left);
        }
        if(root.right!=null){
            postOrder(root.right);
        }
        list.add(root.value);
        return list;

//        System.out.println(root.value);
    }


}
