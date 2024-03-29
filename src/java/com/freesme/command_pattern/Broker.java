package com.freesme.command_pattern;

import java.util.ArrayList;
import java.util.List;

//命令调用类
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
