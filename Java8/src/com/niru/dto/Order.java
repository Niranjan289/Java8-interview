package com.niru.dto;

public class Order {
    private int id;
    private String orderName;

    Order(){}
    public Order(int id, String orderName){
        this.id = id;
        this.orderName=orderName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
