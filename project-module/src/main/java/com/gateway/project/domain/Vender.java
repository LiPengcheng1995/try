package com.gateway.project.domain;

/**
 * @author: lipengcheng3
 * @create: 2018-09-04 17:29
 * @description:
 **/
public class Vender {
    private int sku;

    private String name;

    private Long price;

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
