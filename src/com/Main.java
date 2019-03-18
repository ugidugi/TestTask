package com;

public class Main {
    private static  BinaryTree tree;
    public static void main(String[] args) {
        fillThree();
        System.out.println(tree.getShortestWay());
    }

    //Заполнение древа данными
    private static void fillThree(){
        tree = new BinaryTree();
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');
        Node j = new Node('J');
        tree.setRoot(a);
        setChildAndPerents(a,b,c);
        setChildAndPerents(b,d,e);
        setChildAndPerents(c,f,g);
        setChildAndPerents(d,h,i);
        setChildAndPerents(e,j,null);
    }
    private static void setChildAndPerents(Node root,Node right,Node left){
        root.setRight(right);
        root.setLeft(left);
        if(right!=null)
            right.setRoot(root);
        if(left!=null)
            left.setRoot(root);
    }
}
