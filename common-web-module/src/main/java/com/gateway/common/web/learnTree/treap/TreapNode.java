package com.gateway.common.web.learnTree.treap;

import com.gateway.common.web.learnTree.dicar.InputNode;

/**
 * @author lipengcheng3 Created date 2018-09-25 17:31
 * @description:
 */
public class TreapNode extends InputNode {

    private TreapNode left;

    private TreapNode right;

    public TreapNode() {
    }

    public TreapNode(InputNode inputNode) {
        super(inputNode.getId(), inputNode.getKey(), inputNode.getValue());
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
