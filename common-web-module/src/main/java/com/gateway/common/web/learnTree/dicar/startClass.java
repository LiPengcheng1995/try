package com.gateway.common.web.learnTree.dicar;

import java.util.ArrayList;
import java.util.List;

public class startClass {

    public static void main(String args[]) {
        List<InputNode> inputNodes = new ArrayList<>();
        inputNodes.add(new InputNode(1, 3, 7));
        inputNodes.add(new InputNode(2, 2, 5));
        inputNodes.add(new InputNode(3, 1, 8));
        inputNodes.add(new InputNode(4, 6, 4));
        inputNodes.add(new InputNode(5, 9, 2));
        inputNodes.add(new InputNode(6, 12, 3));
        inputNodes.add(new InputNode(7, 10, 6));
        inputNodes.add(new InputNode(8, 5, 1));
        inputNodes.add(new InputNode(9, 4, 9));
        inputNodes.add(new InputNode(10, 20, 10));
        DicarTree dicarTree = new DicarTree();
        dicarTree.create(inputNodes);
        System.out.println(dicarTree.showBefore());
        System.out.println(dicarTree.showMiddle());



    }

}
