package org.example.builder;


import java.util.ArrayList;
import java.util.List;

/**
 * 所有汽车的总建造工厂(工厂模式)
 */
public class CarFactory {

    /**
     * 奔驰车工厂，通过调用奔驰车工厂生产奔驰车
     * @return
     */
    public static BenzCar createBenzCar(){
        List<String> benzOrders=new ArrayList<>(4);
        benzOrders.add("start");
        benzOrders.add("engine");
        benzOrders.add("alarm");
        benzOrders.add("stop");

        BenzCarBuilder benzCarBuilder=new BenzCarBuilder();
        benzCarBuilder.setOrders(benzOrders);
        return (BenzCar)benzCarBuilder.getCar();
    }


    /**
     * 宝马车工厂，通过调用宝马车工厂生产宝马
     * @return
     */
    public static BmwCar createBmwCar(){
        List<String> bmwOrders=new ArrayList<>(4);
        bmwOrders.add("start");
        bmwOrders.add("alarm");
        bmwOrders.add("engine");
        bmwOrders.add("stop");

        BmwCarBuilder bmwCarBuilder=new BmwCarBuilder();
        bmwCarBuilder.setOrders(bmwOrders);
        return  (BmwCar) bmwCarBuilder.getCar();
    }

}
