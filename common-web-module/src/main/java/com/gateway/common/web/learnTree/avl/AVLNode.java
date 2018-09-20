package com.gateway.common.web.learnTree.avl;

public class AVLNode {
    private int key;

    private AVLNode left;

    private AVLNode right;

    private int depth;

    public AVLNode(int key) {
        this.key = key;
        this.depth = 1;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public AVLNode getLeft() {
        return left;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
