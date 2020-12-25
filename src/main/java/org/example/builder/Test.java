package org.example.builder;

public class Test {

    public static void main(String[] args) {

        BenzCar benzCar= CarFactory.createBenzCar();
        benzCar.run();


        System.out.println("------------------------------");


        BmwCar bmwCar=CarFactory.createBmwCar();
        bmwCar.run();
    }


}
