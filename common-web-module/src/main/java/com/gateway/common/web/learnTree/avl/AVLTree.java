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

    public boolean remove(int key) {
        return false;
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

        if (!ifBalance(parent)) {
            parent = balance(parent);
        }
        this.updateDepth(parent);
        return parent;
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
