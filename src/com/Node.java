package com;

public class Node implements Comparable<Node> {
    private Character key;
    private Node root;
    private Node left;
    private Node right;

    public Node(Character key) {
        this.key = key;
    }

    @Override
    public int compareTo(Node o) {
        if((int)key > (int)o.key ){
            return 1;
        }
        if((int)key < (int)o.key ){
            return -1;
        }
        return 0;
    }

    public Character getKey() {
        return key;
    }

    public void setKey(Character key) {
        this.key = key;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
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

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
