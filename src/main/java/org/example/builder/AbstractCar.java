package org.example.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车抽象类，定义抽象方法和汽车的共性方法
 */
public abstract class AbstractCar {
    //私有域，定于run的顺序
    private List<String> orders=new ArrayList<>();

    //汽车启动
    public abstract void start();

    //汽车引擎发动
    public abstract void engine();

    //汽车鸣笛
    public abstract void alarm();

    //汽车停止
    public abstract void stop();

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    /**
     * 汽车的运动方式，不同汽车顺序可能不一样，需要厂商去定制
     * 可能是 启动-引擎-停止
     * 可能是 启动-鸣笛-停止
     */
    public final void run(){
        orders.forEach(order -> {
            if(order.equalsIgnoreCase("start")){
                start();
            }
            if (order.equalsIgnoreCase("engine")){
                engine();
            }
            if(order.equalsIgnoreCase("alarm")){
                alarm();
            }
            if(order.equalsIgnoreCase("stop")){
                stop();
            }
        });
    }

}
