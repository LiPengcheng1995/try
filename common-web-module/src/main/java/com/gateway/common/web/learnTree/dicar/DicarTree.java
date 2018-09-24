package com.gateway.common.web.learnTree.dicar;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class DicarTree {

    private DicarNode root;

    public void create(List<InputNode> inputNodes) {
        Collections.sort(inputNodes);
        System.out.println("Sort Result Show");
        for (InputNode temp : inputNodes) {
            System.out.println(temp.show());
        }

        System.out.println("\r\n\r\n");

        Stack<DicarNode> stack = new Stack<>();
        stack.push(new DicarNode(inputNodes.get(0)));
        for (int i = 1; i < inputNodes.size(); i++) {
            DicarNode temp = new DicarNode(inputNodes.get(i));
            // 笛卡尔树我们默认是最大堆吧
            while (stack.size() > 1 && stack.peek().compareTo(temp) < 0) {
                stack.pop();
            }
            //怕全出栈出完了没法把新的根节点和原来的树的部分链接起来
            if (stack.peek().compareTo(temp) < 0) {
                temp.setLeft(stack.peek());
                stack.pop();
                stack.push(temp);
            } else {
                temp.setParent(stack.peek());
                temp.setLeft(stack.peek().getRight());
                stack.peek().setRight(temp);
                stack.push(temp);
            }
        }
        root = stack.peek();

    }

    public String showBefore() {
        return showBefore(root, "");
    }

    public String showMiddle() {
        return showMiddle(root, "");
    }

    private String showBefore(DicarNode parent, String input) {
        String result = input + parent.getId() + ",";
        if (Objects.nonNull(parent.getLeft())) {
            result = showBefore(parent.getLeft(), result);
        }
        if (Objects.nonNull(parent.getRight())) {
            result = showBefore(parent.getRight(), result);
        }
        return result;
    }

    private String showMiddle(DicarNode parent, String input) {
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
