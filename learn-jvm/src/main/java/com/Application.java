package com;

import com.domain.TestCalender;
import com.domain.TestRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:+PrintGCDetails -Xloggc:/Users/lipengcheng3/Desktop/learn_jvm.log -Xmx20M -Xms20M -Xmn10M
 * @author lipengcheng3 Created date 2019-03-18 16:13
 */
public class Application implements Runnable {

    public static final String DESC_UNIT = "啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊";
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            new Thread(new Application(),"线程"+i).start();
        }
    }

    /**
     * 测试函数，每次调用，会创建1M的对象，然后睡眠1s，然后退出。
     */
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            generateTestCalender(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public TestCalender generateTestCalender(int index){
        TestCalender testCalender = new TestCalender();
        testCalender.setTitle("测试，标题");
        int x = (int) (Math.random()*100);
        String temp = "";
        for (int i=0;i<x;i++){
            temp+= DESC_UNIT;
        }
        testCalender.setDescription(temp);


        List<TestRoom> testRoomList = new ArrayList<>();
        testRoomList.add(new TestRoom());
        System.out.println(Thread.currentThread().getName()+"分配完成,本次是第"+index+"次");
        return testCalender;
    }


}
