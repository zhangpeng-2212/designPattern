package org.example.command;

/**
 * 部门总负责人，负责处理客户交代过来的命令
 * 内部通过调用命令的execute()方法来进行实际的处理
 */
public class Invoker {
    private Command command;

    public void acceptCommand(Command command){
        System.out.println("接收到一条命令,"+command.toString());
        this.command=command;
    }

    public void action(){
        System.out.println("部门总负责人开始处理命令");
        command.execute();
    }

}
