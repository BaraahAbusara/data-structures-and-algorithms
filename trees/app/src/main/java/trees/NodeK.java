package trees;

import java.util.List;

public class NodeK<D extends Number> {
    double value ;
    List<NodeK<Double>> children;

    public NodeK(double value) {
        this.value = value;
    }

    public NodeK() {
    }

    @Override
    public String toString() {
        return "NodeK{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}
