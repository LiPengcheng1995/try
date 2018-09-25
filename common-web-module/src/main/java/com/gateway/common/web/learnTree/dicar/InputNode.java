package com.gateway.common.web.learnTree.dicar;

/**
 * @author lipengcheng3 Created date 2018-09-21 16:24
 * @description:
 */
public class InputNode implements Comparable<InputNode> {

    private int id;

    private int key;

    private int value;

    public InputNode() {

    }

    public InputNode(int id, int key, int value) {
        this.id = id;
        this.key = key;
        this.value = value;
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

    @Override
    public int compareTo(InputNode o) {
        if (this.key < o.key) {
            return -1;
        }
        if (this.key > o.key) {
            return 1;
        }
        return 0;
    }

    public String show() {
        return "id = " + this.id + "   key = " + this.getKey() + "   value=" + this.getValue();
    }
}
