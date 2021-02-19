package org.example.status;

/**
 * 电梯关门状态
 */
public class LeftCloseState extends LeftState{

    /**
     * 执行关门动作
     */
    @Override
    public void close() {
        System.out.println("关门状态下，电梯门关闭");
    }

    /**
     * 进行开门动作
     */
    @Override
    public void open() {
       this.getLeftContext().setLeftState(new LeftOpenState());
       this.getLeftContext().open();
    }

    @Override
    public void run() {
        this.getLeftContext().setLeftState(new LeftRunState());
        this.getLeftContext().run();
    }

    @Override
    public void stop() {
        this.getLeftContext().setLeftState(new LeftStopState());
        this.getLeftContext().stop();
    }
}
