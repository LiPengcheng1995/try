package com;

/**
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/Users/lipengcheng3/Desktop/dump.hprof -XX:+UseSerialGC -XX:+PrintGCDetails -Xloggc:/Users/lipengcheng3/Desktop/learn_jvm.log -Xmx20M -Xms20M -Xmn10M -XX:PretenureSizeThreshold=3145728
 * @author lipengcheng3 Created date 2019-03-18 17:44
 */
public class Application1 {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocate1,allocate2,allocate3,allocate4;
        allocate1 = new byte[2 * _1MB];
        allocate2 = new byte[4 * _1MB];
        allocate3 = new byte[4 * _1MB];
        allocate4 = new byte[4 * _1MB];

    }
}
