package org.example.builder;

/**
 * 奔驰车
 */
public class BenzCar extends AbstractCar {
    @Override
    public void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    public void engine() {
        System.out.println("奔驰车引擎发动");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停止");
    }
}
