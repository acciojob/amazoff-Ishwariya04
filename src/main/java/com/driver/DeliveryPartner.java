package com.driver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryPartner {

    private String id;
    private int numberOfOrders;

    public DeliveryPartner(String id) {
        this.id = id;
        this.numberOfOrders = 0;
    }

}