package org.example.status;

/**
 * 电梯关闭状态
 */
public class LeftStopState extends LeftState{

    /**
     * 进行关门动作
     */
    @Override
    public void close() {
        System.out.println("停止状态下，电梯门不可以重复关闭");
    }

    /**
     * 进行开门动作
     */
    @Override
    public void open() {
        System.out.println("停止状态下，电梯不可以开门");
    }

    @Override
    public void run() {
        System.out.println("停止状态下，电梯不可以运行");
    }

    @Override
    public void stop() {
        System.out.println("停止状态下，电梯慢慢停止");
    }
}
