package com.elasticsearch.template.dto;


public class OrderDTO {

    private int orderId;
    private String orderTime;
    private String orderKey;
    private String orderPayment;
    private String orderedByName;
    private String orderedBySurname;
    private String orderedByAddress;
    private String orderedByPhoneNumber;
    private String orderedByEmail;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
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
