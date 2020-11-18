package com.elasticsearch.template.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "order", indexStoreType = "default")
public class ESOrder {
    @Id
    private int orderId;
    private String OrderKey;
    private String orderTime;
    private String orderPayment;
    private String orderedByName;
    private String orderedBySurname;
    private String orderedByAddress;
    private String orderedByPhoneNumber;
    private String orderedByEmail;

    public String getOrderKey() {
        return OrderKey;
    }

    public void setOrderKey(String orderKey) {
        OrderKey = orderKey;
    }

    public String getOrderedByName() {
        return orderedByName;
    }

    public void setOrderedByName(String orderedByName) {
        this.orderedByName = orderedByName;
    }

    public String getOrderedBySurname() {
        return orderedBySurname;
    }

    public void setOrderedBySurname(String orderedBySurname) {
        this.orderedBySurname = orderedBySurname;
    }

    public String getOrderedByAddress() {
        return orderedByAddress;
    }

    public void setOrderedByAddress(String orderedByAddress) {
        this.orderedByAddress = orderedByAddress;
    }

    public String getOrderedByPhoneNumber() {
        return orderedByPhoneNumber;
    }

    public void setOrderedByPhoneNumber(String orderedByPhoneNumber) {
        this.orderedByPhoneNumber = orderedByPhoneNumber;
    }

    public String getOrderedByEmail() {
        return orderedByEmail;
    }

    public void setOrderedByEmail(String orderedByEmail) {
        this.orderedByEmail = orderedByEmail;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

}
