/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:36
 **/

package com.gateway.service.b.jsfBack.impl;

import com.gateway.service.b.jsfBack.ServiceBConsumer;

public class ServiceBConsumerImpl implements ServiceBConsumer {

    private String alias;

    private String timeOut;

    public ServiceBConsumerImpl(String alias, String timeOut) {
        this.alias = alias;
        this.timeOut = timeOut;
    }

    @Override
    public String doServiceB() {
        return "Service Message from JSF provider";
    }
}
