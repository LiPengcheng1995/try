package com.gateway.common.web.learnTree.treap;

import com.gateway.common.web.learnTree.dicar.InputNode;

/**
 * @author lipengcheng3 Created date 2018-09-25 17:31
 * @description:Treap和笛卡尔树的一个重要区别是笛卡尔树的value的意义是存在的。 而Treapd的value只是一个BBST，它的value只是引入了一个随机值来实现BBST的平衡
 */
public class StartClass {

    public static void main(String[] args) {
        Treap treap = new Treap();
        treap.insert(new InputNode(1, 3, 7));
        treap.insert(new InputNode(2, 2, 5));
        treap.insert(new InputNode(3, 1, 8));
        treap.insert(new InputNode(4, 6, 4));
        treap.insert(new InputNode(5, 9, 2));
        treap.insert(new InputNode(6, 12, 3));
        treap.insert(new InputNode(7, 10, 6));
        treap.insert(new InputNode(8, 5, 1));
        treap.insert(new InputNode(9, 4, 9));
        treap.insert(new InputNode(10, 20, 10));

        System.out.println(treap.showBefore());
        System.out.println(treap.showMiddle());

        treap.delete(4);

        System.out.println(treap.showBefore());
        System.out.println(treap.showMiddle());

    }
}
