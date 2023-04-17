package BST;

public interface BTSNode {

    int key = 0;
    BSTNode right;
    BSTNode left;

    public default void Node(int data) {
        key = data;
        right = null;
        left = null;
    }



}
