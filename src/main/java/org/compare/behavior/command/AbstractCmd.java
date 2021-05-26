package org.compare.behavior.command;


/**
 * 命令抽象类，是所有命令的父类，定义一个公共方法，给子类实现
 * 相当于顾客想要点餐
 */
public abstract class AbstractCmd {

    public abstract void execute(String source,String to);

}
