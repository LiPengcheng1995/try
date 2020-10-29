package com.lpc.lean.lock;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/10/29
 * @Time: 15:50
 * @Description:
 */
public class LeanSynchronized {
    public static void main(String[] args) {
        new Thread(new haohao()).start();
        new Thread(new hehe()).start();
    }

    static class haohao implements Runnable{

        @Override
        public void run() {
            synchronized ("好好"){
                System.out.println("好好");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class hehe implements Runnable{

        @Override
        public void run() {
            synchronized ("呵呵"){
                System.out.println("呵呵");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
