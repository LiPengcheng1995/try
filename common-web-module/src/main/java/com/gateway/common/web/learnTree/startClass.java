package com.gateway.common.web.learnTree;

import com.gateway.common.web.learnTree.avl.AVLTree;

public class startClass {

    public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        System.out.println(tree.showBefore());
        System.out.println(tree.showMiddle());
        System.out.println(tree.showAfter());
    }

}
