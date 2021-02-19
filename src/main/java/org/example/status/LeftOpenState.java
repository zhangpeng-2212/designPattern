package org.example.status;

/**
 * 电梯开门状态
 */
public class LeftOpenState extends LeftState{

    /**
     * 开门状态下的关门
     * 现将状态设置为关门，再执行关门动作
     */
    @Override
    public void close() {
        this.getLeftContext().setLeftState(new LeftCloseState());
        this.getLeftContext().close();
    }

    /**
     * 开门动作
     */
    @Override
    public void open() {
        System.out.println("开门状态下，电梯门进行开启");
    }

    @Override
    public void run() {
        System.out.println("开门状态下，不可以运行");
    }

    @Override
    public void stop() {
        System.out.println("开门状态下，不可以停止");
    }
}
