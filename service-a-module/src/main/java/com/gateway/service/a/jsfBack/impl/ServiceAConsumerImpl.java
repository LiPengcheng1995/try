/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:36
 **/

package com.gateway.service.a.jsfBack.impl;

import com.gateway.service.a.jsfBack.ServiceAConsumer;

public class ServiceAConsumerImpl implements ServiceAConsumer {

    private String alias;

    private String timeOut;

    public ServiceAConsumerImpl(String alias,String timeOut) {
        this.alias = alias;
        this.timeOut = timeOut;
    }

    @Override
    public String doServiceA() {
        return "Service Message from JSF provider";
    }
}
