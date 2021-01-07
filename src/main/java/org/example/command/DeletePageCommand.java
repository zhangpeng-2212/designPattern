package org.example.command;

/**
 * 删除页面命令
 */
public class DeletePageCommand extends Command{
    private final Group pageGroup=new PageGroup();

    @Override
    void execute() {
        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();
    }

    @Override
    public String toString() {
        return "这是一条删除页面命令";
    }

}
