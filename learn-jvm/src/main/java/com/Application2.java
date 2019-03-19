package com;

import com.domain.OOMObject;

import java.util.ArrayList;
import java.util.List;

/**
 *-Xms100M -Xmx100M -XX:+UseSerialGC
 * @author lipengcheng3 Created date 2019-03-19 14:53
 */
public class Application2 {
    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i=0;i<1000;i++){
            // 稍作延迟，使曲线变化明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        list = null;
        System.gc();
        Thread.sleep(3*60*1000);
    }


}
