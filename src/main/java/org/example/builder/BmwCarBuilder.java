package org.example.builder;

import java.util.List;


/**
 * 宝马车厂商
 */
public class BmwCarBuilder extends CarBuilder{

    /**
     * 静态内部类单例
     */
    private static class BmwCarHolder{
        private static final BmwCar BbmwCar=new BmwCar();
    }

    @Override
    public void setOrders(List<String> orders) {
        BmwCarHolder.BbmwCar.setOrders(orders);
    }

    @Override
    public AbstractCar getCar() {
        return BmwCarHolder.BbmwCar;
    }
}
