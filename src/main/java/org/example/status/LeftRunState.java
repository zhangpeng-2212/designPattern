package org.example.status;

/**
 * 电梯运行状态
 */
public class LeftRunState extends LeftState{

    /**
     * 进行关门动作
     */
    @Override
    public void close() {
        System.out.println("运行状态下，电梯门不可以重复关闭");
    }

    /**
     * 进行开门动作
     */
    @Override
    public void open() {
        System.out.println("运行状态下，电梯不可以开门");
    }

    @Override
    public void run() {
        System.out.println("运行状态下，电梯开始运行");
    }

    @Override
    public void stop() {
        System.out.println("运行状态下，电梯不可以停止");
    }
}
