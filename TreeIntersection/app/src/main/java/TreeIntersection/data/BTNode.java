package TreeIntersection.data;

public class BTNode {
    private int value;
    private BTNode left;
    private BTNode right;

    public BTNode(int value, BTNode left, BTNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    public BTNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }
}
