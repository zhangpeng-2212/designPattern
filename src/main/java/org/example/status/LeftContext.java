package org.example.status;

/**
 * 电梯类，包含电梯当前的状态
 */
public class LeftContext {
    private LeftState leftState;


    public LeftState getLeftState() {
        return leftState;
    }

    public void setLeftState(LeftState leftState) {
        this.leftState = leftState;
        this.leftState.setLeftContext(this);
    }

    /**
     * 当前状态下的开门，交给当前状态去判断执行
     * 因为不同状态执行动作不同，比如关门状态下可以开门，但是运行状态下不可以开门
     */
    public void open(){
        this.leftState.open();
    }

    /**
     * 当前状态下的关门，交给当前状态去判断执行
     * 因为不同状态执行动作不同，比如开门状态下可以关门，但是停止状态下不可以再关门
     */
    public void close(){
        this.leftState.close();
    }

    /**
     * 当前状态下的运行，交给当前状态去判断执行
     * 因为不同状态执行动作不同，比如关门状态下可以运行，但是开门状态下不可以运行
     */
    public void run(){
        this.leftState.run();
    }

    /**
     * 当前状态下的停止，交给当前状态去判断执行
     * 因为不同状态执行动作不同，比如关门状态下可以停止，但是运行状态下不可以停止
     */
    public void stop(){
        this.leftState.stop();
    }

}
