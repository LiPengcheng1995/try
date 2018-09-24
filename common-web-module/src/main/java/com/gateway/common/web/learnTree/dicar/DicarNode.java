package com.gateway.common.web.learnTree.dicar;

public class DicarNode implements Comparable<DicarNode> {

    private int id;

    private int key;

    private int value;

    private DicarNode left;

    private DicarNode right;

    private DicarNode parent;

    public DicarNode(InputNode inputNode) {
        this.id = inputNode.getId();
        this.key = inputNode.getKey();
        this.value = inputNode.getValue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DicarNode getLeft() {
        return left;
    }

    public void setLeft(DicarNode left) {
        this.left = left;
    }

    public DicarNode getRight() {
        return right;
    }

    public void setRight(DicarNode right) {
        this.right = right;
    }

    public DicarNode getParent() {
        return parent;
    }

    public void setParent(DicarNode parent) {
        this.parent = parent;
    }

    @Override
    public int compareTo(DicarNode o) {
        if (this.value < o.value) {
            return -1;
        }
        if (this.value > o.value) {
            return 1;
        }
        return 0;
    }
}
