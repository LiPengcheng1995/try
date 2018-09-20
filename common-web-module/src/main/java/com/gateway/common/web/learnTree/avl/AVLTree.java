package com.gateway.common.web.learnTree.avl;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class AVLTree {
    private AVLNode root;

    public void insert(int key) {
        if (Objects.isNull(this.root)) {
            this.root = new AVLNode(key);
        } else {
            this.root = this.insert(key, this.root);
        }
    }

    public void remove(int key) {
        this.root = this.remove(key, this.root);
    }

    public void clear() {
        this.root = null;
    }

    public String showBefore() {
        return showBefore(root, "");
    }

    public String showMiddle() {
        return showMiddle(root, "");
    }

    public String showAfter() {
        return showAfter(root, "");
    }

    public String showLevel() {
        Queue<AVLNode> queue = new LinkedBlockingQueue<>();
        String result = "";

        queue.offer(root);
        while (!queue.isEmpty()) {
            AVLNode temp = queue.poll();
            if (Objects.nonNull(temp.getLeft())) {
                queue.offer(temp.getLeft());
            }
            if (Objects.nonNull(temp.getRight())) {
                queue.offer(temp.getRight());
            }
            result += temp.getKey() + ",";
        }
        return result;
    }


    private AVLNode insert(int key, AVLNode parent) {
        if (key == parent.getKey()) {
            return parent;
        }
        if (key < parent.getKey()) {
            if (Objects.isNull(parent.getLeft())) {
                parent.setLeft(new AVLNode(key));
            } else {
                parent.setLeft(insert(key, parent.getLeft()));
            }

        } else if (key > parent.getKey()) {
            if (Objects.isNull(parent.getRight())) {
                parent.setRight(new AVLNode(key));
            } else {
                parent.setRight(insert(key, parent.getRight()));
            }
        }
        updateDepth(parent);
        if (!ifBalance(parent)) {
            parent = balance(parent);
            updateDepth(parent);

        }
        this.updateDepth(parent);
        return parent;
    }

    private AVLNode remove(int key, AVLNode parent) {
        if (Objects.isNull(parent)) {
            return null;
        }
        if (key < parent.getKey()) {
            parent.setLeft(remove(key, parent.getLeft()));
        } else if (key > parent.getKey()) {
            parent.setRight(remove(key, parent.getRight()));
        } else if (key == parent.getKey()) {
            if (Objects.nonNull(parent.getRight())) {
                int temp = getTheSmallestAVLNode(parent.getRight());
                parent.setRight(removeTheSmallestAVLNode(parent.getRight()));
                parent.setKey(temp);
            } else if (Objects.nonNull(parent.getLeft())) {
                int temp = getTheLargestAVLNode(parent.getLeft());
                parent.setLeft(removeTheLargestAVLNode(parent.getRight()));
                parent.setKey(temp);
            } else {
                return null;
            }
        }
        updateDepth(parent);
        if (!ifBalance(parent)) {
            parent = balance(parent);
            updateDepth(parent);
        }
        return parent;
    }

    private AVLNode removeTheSmallestAVLNode(AVLNode parent) {
        if (Objects.isNull(parent.getLeft())) {
            if (Objects.nonNull(parent.getRight())) {
                this.remove(parent.getKey());
            } else {
                //左右均空，是对应的叶子节点
                return null;
            }
        } else {
            parent.setLeft(removeTheSmallestAVLNode(parent.getLeft()));
        }

        updateDepth(parent);
        if (!ifBalance(parent)) {
            parent = balance(parent);
            updateDepth(parent);
        }
        return parent;
    }

    private int getTheSmallestAVLNode(AVLNode parent) {
        AVLNode temp = parent.getLeft();
        if (Objects.isNull(temp)) {
            return parent.getKey();
        }
        while (Objects.nonNull(temp.getLeft())) {
            temp = temp.getLeft();
        }
        return temp.getKey();
    }

    private AVLNode removeTheLargestAVLNode(AVLNode parent) {
        if (Objects.isNull(parent.getRight())) {
            if (Objects.nonNull(parent.getLeft())) {
                this.remove(parent.getKey());
            } else {
                //左右均空，是对应的叶子节点
                return null;
            }
        } else {
            parent.setRight(removeTheLargestAVLNode(parent.getRight()));
        }

        updateDepth(parent);
        if (!ifBalance(parent)) {
            parent = balance(parent);
            updateDepth(parent);
        }
        return parent;
    }


    private int getTheLargestAVLNode(AVLNode parent) {
        AVLNode temp = parent.getRight();
        if (Objects.isNull(temp)) {
            return parent.getKey();
        }
        while (Objects.nonNull(temp.getRight())) {
            temp = temp.getRight();
        }
        return temp.getKey();
    }


    private void updateDepth(AVLNode parent) {
        if (Objects.nonNull(parent.getLeft())) {
            AVLNode temp = parent.getLeft();
            temp.setDepth((getLeftDepth(temp) > getRightDepth(temp) ? getLeftDepth(temp) : getRightDepth(temp)) + 1);
        }
        if (Objects.nonNull(parent.getRight())) {
            AVLNode temp = parent.getRight();
            temp.setDepth((getLeftDepth(temp) > getRightDepth(temp) ? getLeftDepth(temp) : getRightDepth(temp)) + 1);
        }
        parent.setDepth((getLeftDepth(parent) > getRightDepth(parent) ? getLeftDepth(parent) : getRightDepth(parent)) + 1);
    }

    private boolean ifBalance(AVLNode parent) {
        if (Math.abs(getLeftDepth(parent) - getRightDepth(parent)) > 1) {
            return false;
        }
        return true;
    }

    private int getLeftDepth(AVLNode parent) {
        return Objects.isNull(parent.getLeft()) ? 0 : parent.getLeft().getDepth();
    }

    private int getRightDepth(AVLNode parent) {
        return Objects.isNull(parent.getRight()) ? 0 : parent.getRight().getDepth();
    }

    private AVLNode balance(AVLNode parent) {
        if (getLeftDepth(parent) > getRightDepth(parent)) {
            if (getLeftDepth(parent.getLeft()) > getRightDepth(parent.getLeft())) {
                //左左
                return this.rotateRight(parent);
            } else {
                //左右
                parent.setLeft(this.rotateLeft(parent.getLeft()));
                return this.rotateRight(parent);
            }
        } else {
            if (getLeftDepth(parent.getRight()) > getRightDepth(parent.getRight())) {
                //右左
                parent.setRight(this.rotateRight(parent.getRight()));
                return this.rotateLeft(parent);
            } else {
                //右右
                return this.rotateLeft(parent);
            }
        }
    }

    private AVLNode rotateLeft(AVLNode parent) {
        AVLNode rotateRoot = parent;
        AVLNode temp = rotateRoot.getRight();

        rotateRoot.setRight(temp.getLeft());
        temp.setLeft(rotateRoot);
        rotateRoot = temp;

        return rotateRoot;
    }

    private AVLNode rotateRight(AVLNode parent) {
        AVLNode rotateRoot = parent;
        AVLNode temp = rotateRoot.getLeft();

        rotateRoot.setLeft(temp.getRight());
        temp.setRight(rotateRoot);
        rotateRoot = temp;

        return rotateRoot;
    }

    private String showBefore(AVLNode now, String result) {
        result += now.getKey() + ",";
        if (Objects.nonNull(now.getLeft())) {
            result = showBefore(now.getLeft(), result);
        }
        if (Objects.nonNull(now.getRight())) {
            result = showBefore(now.getRight(), result);
        }
        return result;
    }

    private String showMiddle(AVLNode now, String result) {
        if (Objects.nonNull(now.getLeft())) {
            result = showMiddle(now.getLeft(), result);
        }
        result += now.getKey() + ",";

        if (Objects.nonNull(now.getRight())) {
            result = showMiddle(now.getRight(), result);
        }
        return result;
    }

    private String showAfter(AVLNode now, String result) {
        if (Objects.nonNull(now.getLeft())) {
            result = showAfter(now.getLeft(), result);
        }
        if (Objects.nonNull(now.getRight())) {
            result = showAfter(now.getRight(), result);
        }
        result += now.getKey() + ",";
        return result;
    }

}
