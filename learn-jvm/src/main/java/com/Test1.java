package com;

import sun.misc.Unsafe;

import java.io.IOException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author lipengcheng3 Created date 2019-03-20 14:42
 */
public class Test1 {
        public static void main(String[] args){
            String x = new StringBuilder("张").append("三").toString();
            String y = new StringBuilder("张").append("三丰").toString().substring(0,2);
            System.out.println("x = " + x);
            System.out.println("y = "+ y);
            System.out.println(x == y);
        }
}
