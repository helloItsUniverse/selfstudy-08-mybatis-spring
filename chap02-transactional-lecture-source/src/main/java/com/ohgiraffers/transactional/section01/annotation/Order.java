package com.ohgiraffers.transactional.section01.annotation;

public class Order {
    private int ordeCode;
    private String orderDate;
    private String orderTime;
    private int totalOrderPrice;

    public Order() {
    }

    public Order(int ordeCode, String orderDate, String orderTime, int totalOrderPrice) {
        this.ordeCode = ordeCode;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.totalOrderPrice = totalOrderPrice;
    }

    public int getOrdeCode() {
        return ordeCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public int getTotalOrderPrice() {
        return totalOrderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordeCode=" + ordeCode +
                ", orderDate='" + orderDate + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", totalOrderPrice=" + totalOrderPrice +
                '}';
    }
}
