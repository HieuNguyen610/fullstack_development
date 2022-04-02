package com.example.fullstack_development.BinarySearchTree;

import javax.websocket.Decoder.Binary;

public class BinarySearchTree {

    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value, int depth){
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(int value){
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    public void insert(int insertValue){
        if(insertValue < this.value){
            if(this.left == null){
                this.left = new BinarySearchTree(insertValue, this.depth + 1);
            }else{
                this.left.insert(insertValue);
            }
        }else{
            if(this.right == null){
                this.right = new BinarySearchTree(insertValue, this.depth + 1);
            }else{
                this.right.insert(insertValue);
            }
        }
    }



    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(100);
        tree.insert(25);
        tree.insert(125);
        tree.insert(50);
        System.out.println(tree);
    }

}
