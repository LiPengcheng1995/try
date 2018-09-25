package com.gateway.common.web.learnTree.treap;

import com.gateway.common.web.learnTree.dicar.InputNode;

import java.util.Objects;

/**
 * @author lipengcheng3 Created date 2018-09-25 17:31
 * @description:平衡树+最大堆
 */
public class Treap {

    private TreapNode root;

    public void insert(InputNode inputNode){
        if (Objects.isNull(this.root)){
            this.root = new TreapNode(inputNode);
        }else{
            this.root = this.insert(this.root,inputNode);
        }
    }

    public void delete(int key){

    }

    public String showBefore() {
        return showBefore(root, "");
    }

    public String showMiddle() {
        return showMiddle(root, "");
    }



    private TreapNode insert(TreapNode parent,InputNode inputNode){
        if (parent.compareTo(inputNode) < 0){
            if (Objects.isNull(parent.getLeft())){
                parent.setLeft(new TreapNode(inputNode));
            }else{
                parent.setLeft(this.insert(parent.getLeft(),inputNode));
            }
            if (parent.getValue() < parent.getLeft().getValue()){
                parent = rotateRight(parent);
            }
        } else{
            //假设没有重复值
            if (Objects.isNull(parent.getRight())){
                parent.setRight(new TreapNode(inputNode));
            }else{
                parent.setRight(this.insert(parent.getRight(),inputNode));
            }
            if (parent.getValue() < parent.getRight().getValue()){
                parent = rotateLeft(parent);
            }
        }
        return parent;
    }

    private TreapNode rotateRight(TreapNode parent){
        TreapNode temp = parent.getLeft();
        parent.setLeft(temp.getRight());
        temp.setRight(parent);
        return temp;
    }

    private TreapNode rotateLeft(TreapNode parent){
        TreapNode temp = parent.getRight();
        parent.setRight(temp.getLeft());
        temp.setLeft(parent);
        return temp;
    }


    private String showBefore(TreapNode parent, String input) {
        String result = input + parent.getId() + ",";
        if (Objects.nonNull(parent.getLeft())) {
            result = showBefore(parent.getLeft(), result);
        }
        if (Objects.nonNull(parent.getRight())) {
            result = showBefore(parent.getRight(), result);
        }
        return result;
    }

    private String showMiddle(TreapNode parent, String input) {
        String result = input;
        if (Objects.nonNull(parent.getLeft())) {
            result = showMiddle(parent.getLeft(), result);
        }
        result = result + parent.getId() + ",";
        if (Objects.nonNull(parent.getRight())) {
            result = showMiddle(parent.getRight(), result);
        }
        return result;
    }
}
