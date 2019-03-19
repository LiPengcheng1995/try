package com.domain;

/**
 * 内存占位对象，一个大概占64k
 * @author lipengcheng3 Created date 2019-03-19 14:55
 */
public class OOMObject{
    public byte[] placeholder = new byte[64*1024];
}
