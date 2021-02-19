package org.example.status;


/**
 * 电梯的状态抽象类，包含电梯类以及电梯的基本方法
 * 然后各个电梯状态子类进行实现
 */
public abstract class LeftState {
    private LeftContext leftContext;

    public abstract void close();

    public abstract void open();

    public abstract void run();

    public abstract void stop();

    public LeftContext getLeftContext() {
        return leftContext;
    }

    public void setLeftContext(LeftContext leftContext) {
        this.leftContext = leftContext;
    }
}
