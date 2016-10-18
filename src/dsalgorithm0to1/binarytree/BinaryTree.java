package dsalgorithm0to1.binarytree;
import dsalgorithm0to1.queue.QueueImpl;

/**
 * Created by rakeshgupta on 10/18/16.
 */
public class BinaryTree {

    public static void main(String[] args)
            throws QueueImpl.QueueUnderflowException,
            QueueImpl.QueueOverflowException {

        Node first = new Node(10);
        Node leftChild = new Node(9);
        Node rightChild = new Node(11);

        first.setLeftChild(leftChild);
        first.setRightChild(rightChild);

        breadthFirst(first);

    }

    public static void breadthFirst(Node root)
            throws QueueImpl.QueueOverflowException,
            QueueImpl.QueueUnderflowException{
        if (root == null)
            return;

        QueueImpl<Node> queue = new QueueImpl<>(Node.class);
        queue.enqueue(root);

        while (!queue.isEmpty()){


            Node node = queue.dequeue();
            printNode(node);

            if (node.getLeftChild() != null)
                queue.enqueue(node.getLeftChild());

            if (node.getRightChild() != null)
                queue.enqueue(node.getRightChild());
        }
    }

    private static void printNode(Node node) {
        System.out.print(node.getData() + " ");
    }

    public static class Node<T> {

        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }
}
