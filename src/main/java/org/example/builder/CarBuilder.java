package org.example.builder;


import java.util.List;

/**
 * 汽车建造者，通过设置run的顺序，从而建造出不同的汽车
 */
public abstract class CarBuilder {

    //定制自已的启动顺序
    public abstract void setOrders(List<String> orders);

    //构造汽车
    public abstract AbstractCar getCar();

}
