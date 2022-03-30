package trees;

public class BinarySearchTree<Double> extends BinaryTree{
    BTNode<Double> root;

    void add (double val ){
        if(isEmptyTree())
        {
            root = new BTNode<Double>(val);
        }
        else
        {
            add( val ,root);
        }
    }
    void add (double val ,BTNode<Double> root){
        if(val<root.value){
            if(root.left!=null)
            add(val, root.left);
            else {
                BTNode<Double> btNode = new BTNode<>(val);
                root.left=btNode;
            }
        }
        if(val>root.value){
            if(root.right!=null)
            add(val , root.right);
            else{
                BTNode<Double> btNode = new BTNode<>(val);
                root.right=btNode;
            }
        }

    }
    Boolean isEmptyTree (){
        return root == null;
    }
    Boolean contains(double val){
        if(val!=root.value){
            if(val<root.value)
                return contains (root.left,val);
            else
                return contains(root.right,val);
        }
        else return true;
    }

    Boolean contains (BTNode<Double> root,double val) {
        if (val == root.value)
            return true;

        if (val < root.value)
            if (root.left != null)
                return contains(root.left, val);
            else
                return false;

        else if (root.right != null)
            return contains(root.right, val);
        else
            return false;
    }
}
