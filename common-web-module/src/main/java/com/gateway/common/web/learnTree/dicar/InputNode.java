package com.gateway.common.web.learnTree.dicar;

/**
 * @author lipengcheng3 Created date 2018-09-21 16:24
 * @description:
 */
public class InputNode implements Comparable<InputNode> {

    private int key;

    private int value;

    public InputNode(int key, int value) {
        this.key = key;
        this.value = value;
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
}
