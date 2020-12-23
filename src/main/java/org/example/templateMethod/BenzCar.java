package org.example.templateMethod;

/**
 * 奔驰车
 */
public class BenzCar extends AbstractCar {
    private static boolean alarm=true;

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
    public boolean isAlarm() {
        return alarm;
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停止");
    }


    /**
     * 将是否鸣笛的控制权交给别人
     * @param alarm
     */
    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
