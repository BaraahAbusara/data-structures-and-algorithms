package trees;

public class BTNode<Double> {
    double value ;
    BTNode  left ;
    BTNode  right ;

    public BTNode(double value, BTNode left, BTNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    public BTNode(double value) {
        this.value=value;
    }
}
