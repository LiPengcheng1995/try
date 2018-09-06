package com.gateway.project.domain.vender;

import javax.persistence.*;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 17:43
 * @description:
 **/
@Entity
@Table(name = "vender")
public class Vender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sku;

    private String name;

    private Long price;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
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

