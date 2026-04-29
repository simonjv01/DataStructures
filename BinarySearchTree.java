

public class BinarySearchTree {

    // Node class to represent each tree element
    private static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // ===============INSERT==================
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        // Base case: insert at first empty spot
        if (node == null) return new Node(key);

        // Navigate left or right based on BST property
        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }
        // Duplicate keys are ignored in this implementation
        return node;
    }

    // =====================SEARCH======================
    
}