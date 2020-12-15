package org.example.templateMethod;

public class CarFactory {

    public AbstractCar createBenz(){
        return new BenzCar();
    }

    public AbstractCar createBmw(){
        return new BmwCar();
    }

}
