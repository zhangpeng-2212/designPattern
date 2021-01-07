package org.example.command;

/**
 * 命令的父类，封装各命令公共方法
 * 子类可以持有各部门的引用，对命令进行处理
 */
public abstract class Command {
    /**
     * 对命令的处理
     */
    abstract void execute();

}
