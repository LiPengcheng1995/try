package com.lpc.lean.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/10/29
 * @Time: 15:54
 * @Description:
 */
public class LearnReentrantReadWriteLock {
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        Thread temp = new Thread(new WriteRunnable("写线程1"));
        temp.setName("写线程1");
        temp.start();

        temp = new Thread(new ReadRunnable("读线程1"));
        temp.setName("读线程1");
        temp.start();


        temp = new Thread(new WriteRunnable("写线程2"));
        temp.setName("写线程2");
        temp.start();

        temp = new Thread(new ReadRunnable("读线程2"));
        temp.setName("读线程2");
        temp.start();
    }

    static class WriteRunnable implements Runnable {

        private String name;

        public WriteRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "开始");
            lock.writeLock().lock();
            System.out.println(name + "获得锁");
            lock.writeLock().unlock();
        }
    }

    static class ReadRunnable implements Runnable {

        private String name;

        public ReadRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "开始");
            lock.readLock().lock();
            System.out.println(name + "获得锁");
            lock.readLock().unlock();
        }
    }
}
