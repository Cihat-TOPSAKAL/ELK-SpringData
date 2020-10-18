package com.elasticsearch.template.dto;

import java.util.Date;

public class OrderDTO {

    private int orderId;
    private String orderTime;
    private String orderPayment;
    private String orderType;
    private int orderTenderType;

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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getOrderTenderType() {
        return orderTenderType;
    }

    public void setOrderTenderType(int orderTenderType) {
        this.orderTenderType = orderTenderType;
    }
}
