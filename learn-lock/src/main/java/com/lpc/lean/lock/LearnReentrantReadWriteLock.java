package com.lpc.lean.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/10/29
 * @Time: 15:54
 * @Description:
 * 此demo用于验证 {@code ReentrantReadWriteLock} 在有一个读线程获得读锁时，并不是所有的读线程都能被陆续唤醒。
 *
 * 这里创建了4个线程，操作方法如下：
 * 1. 在所有的 {@code System.out.println(name + "开始");}和
 * {@code System.out.println(name + "获得锁");}都打上断点
 * 2. 然后按以下顺序依次释放
 * {@code System.out.println(name + "开始");} 的断点
 * 写线程1->读线程1->写线程2->读线程2
 * 3. 最后释放 写线程1 的{@code System.out.println(name + "获得锁");}，释放该线程占据的写锁
 * 4. 然后就发现 读线程1 占据了读锁，但是同步队列中的 读线程2 没法拿到读锁。
 *
 * 出现以上问题的原因是 AQS 只是一个先入先出队列，而{@code ReentrantReadWriteLock} 将所有的共享、独占节点都放到了
 * 一个 AQS 队列中。
 *
 * 以上问题考虑到使用{@code ReentrantReadWriteLock} 的场景中写操作极少出现，可以尽量忽略，但是如果想进行优化，
 * 可以考虑对{@code ReentrantReadWriteLock} 进行修改，独占锁和共享锁用两个队列，然后额外自己写两个队列的唤醒关系
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
