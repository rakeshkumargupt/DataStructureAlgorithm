package treeoperation;

/**
 * Created by rakeshgupta on 9/24/16.
 */
public class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node() {
    }

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
