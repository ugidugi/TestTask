package com;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private int minimalStep = Integer.MAX_VALUE;
    private String shortestWay;
    private Node root;

    public String getShortestWay(){
        printKeys(root);
        return shortestWay;
    }

    //Рекурсивный перебор элементов дерева
    private void printKeys(Node x){
        if (x == null) {
            return;
        }
        Node leftNode = x.getLeft();
        printKeys (leftNode);
        Node rightNode = x.getRight();
        printKeys (rightNode);
        if(x.getLeft()==null && x.getRight()==null)
            checkWay(x);

    }

    //Генерация пути от корня к узлу и проверка кол-ва шагов
    private void checkWay(Node node){
        Node r = node;
        int step = 0;
        StringBuffer sb = new StringBuffer();
        while(true){
            if(r==node){
                sb.insert(0,"-"+node.getKey());
                r = node.getRoot();
                step++;
            }else{
                if(r.getRoot()==null){
                    sb.insert(0,r.getKey());
                    step++;
                    break;
                }
                sb.insert(0,"-"+r.getKey());
                r = r.getRoot();
                step++;
            }
        }

        if(minimalStep>step){
            minimalStep = step;
            shortestWay = sb.toString();
        }
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
