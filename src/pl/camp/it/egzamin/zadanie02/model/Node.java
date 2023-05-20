package pl.camp.it.egzamin.zadanie02.model;

class Node {
    private final int value;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
        this.parent = null;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}