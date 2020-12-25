package org.example.builder;

import java.util.List;

/**
 * 奔驰车厂商
 */
public class BenzCarBuilder extends CarBuilder{

    /**
     * 静态内部类单例
     */
    private static class BenzCarHolder{
        private static final BenzCar benzCar=new BenzCar();
    }


    @Override
    public void setOrders(List<String> orders) {
        BenzCarHolder.benzCar.setOrders(orders);
    }

    @Override
    public AbstractCar getCar() {
        return BenzCarHolder.benzCar;
    }
}
