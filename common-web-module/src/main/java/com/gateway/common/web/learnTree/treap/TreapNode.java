package com.gateway.common.web.learnTree.treap;

import com.gateway.common.web.learnTree.dicar.InputNode;

/**
 * @author lipengcheng3 Created date 2018-09-25 17:31
 * @description:
 */
public class TreapNode extends InputNode {

    private int id;

    private int key;

    private int value;

    private TreapNode left;

    private TreapNode right;

    public TreapNode() {
    }

    public TreapNode(InputNode inputNode) {
        super(inputNode.getId(), inputNode.getKey(), inputNode.getValue());
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

    public TreapNode getLeft() {
        return left;
    }

    public void setLeft(TreapNode left) {
        this.left = left;
    }

    public TreapNode getRight() {
        return right;
    }

    public void setRight(TreapNode right) {
        this.right = right;
    }
}
