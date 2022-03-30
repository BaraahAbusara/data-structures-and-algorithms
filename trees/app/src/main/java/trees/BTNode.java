package trees;

public class BTNode<Double> {
    double value ;
    BTNode <Double> left ;
    BTNode <Double> right ;

    public BTNode(double value, BTNode<Double> left, BTNode<Double> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    public BTNode(double value) {
        this.value=value;
    }
}
