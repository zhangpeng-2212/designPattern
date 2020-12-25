package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> benzOrders=new ArrayList<>(4);
        benzOrders.add("start");
        benzOrders.add("engine");
        benzOrders.add("alarm");
        benzOrders.add("stop");

        BenzCarBuilder benzCarBuilder=new BenzCarBuilder();
        benzCarBuilder.setOrders(benzOrders);
        BenzCar benzCar= (BenzCar) benzCarBuilder.getCar();
        benzCar.run();


        System.out.println("------------------------------");


        List<String> bmwOrders=new ArrayList<>(4);
        bmwOrders.add("start");
        bmwOrders.add("alarm");
        bmwOrders.add("engine");
        bmwOrders.add("stop");

        BmwCarBuilder bmwCarBuilder=new BmwCarBuilder();
        bmwCarBuilder.setOrders(bmwOrders);
        BmwCar bmwCar = (BmwCar) bmwCarBuilder.getCar();
        bmwCar.run();
    }


}
