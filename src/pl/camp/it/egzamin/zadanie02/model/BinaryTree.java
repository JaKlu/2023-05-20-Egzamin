package pl.camp.it.egzamin.zadanie02.model;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public boolean add(int value) {
        Node present = getRoot();
        Node parent = null;

        while (present != null) {
            parent = present;
            if (present.getValue() == value) {
                return false;
            }

            if (value > present.getValue()) {
                present = present.getRight();
            } else if (value < present.getValue()) {
                present = present.getLeft();
            }
        }

        Node temp = new Node(value);
        if (parent == null) {
            setRoot(temp);
        } else if (value > parent.getValue()) {
            parent.setRight(temp);
            temp.setParent(parent);
        } else if (value < parent.getValue()) {
            parent.setLeft(temp);
            temp.setParent(parent);
        }
        return true;
    }

    public boolean contains(int value) {
        Node present = getRoot();
        while ((present != null) && (present.getValue() != value)) {
            if (value > present.getValue()) {
                present = present.getRight();
            } else {
                present = present.getLeft();
            }
        }
        if (present == null) {
            return false;
        }
        return true;
    }

    public int min() {
        Node present = getRoot();
        while (present.getLeft() != null) {
            present = present.getLeft();
        }
        return present.getValue();
    }

    public int max() {
        Node present = getRoot();
        while (present.getRight() != null) {
            present = present.getRight();
        }
        return present.getValue();
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}