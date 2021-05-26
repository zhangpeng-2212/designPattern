package org.compare.behavior.command;


/**
 * 命令调度者，负责接收命令，并执行自己的方法
 * 相当于服务员接收顾客的订单命令
 */
public class Invoker {
    private AbstractCmd abstractCmd;

    public Invoker(AbstractCmd abstractCmd) {
        this.abstractCmd = abstractCmd;
    }

    public  void  executeCmd(String source,String to){
        this.abstractCmd.execute(source, to);
    }
}
