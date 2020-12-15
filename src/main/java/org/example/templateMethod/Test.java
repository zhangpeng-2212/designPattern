package org.example.templateMethod;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();

        AbstractCar benz=carFactory.createBenz();
        benz.run();
        
        AbstractCar bmw= carFactory.createBmw();
        bmw.run();
    }


}
