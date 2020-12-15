package org.example.templateMethod;

/**
 * 宝马车
 */
public class BmwCar extends AbstractCar{
    @Override
    public void start() {
        System.out.println("宝马车启动");
    }

    @Override
    public void engine() {
        System.out.println("宝马车引擎发动");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车鸣笛");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停止");
    }
}
