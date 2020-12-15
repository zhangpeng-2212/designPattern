package org.example.templateMethod;

/**
 * 汽车抽象类，定义抽象方法和汽车的共性方法
 */
public abstract class AbstractCar {

    //汽车启动
    public abstract void start();

    //汽车引擎发动
    public abstract void engine();

    //汽车鸣笛
    public abstract void alarm();

    //汽车停止
    public abstract void stop();

    /**
     * 因为所有的汽车运动方式都一样，所以这里抽出来放在父类中，并且final修饰不许子类修改
     */
    public final void run(){
        this.start();
        this.engine();
        this.alarm();
        this.stop();
    }

}
