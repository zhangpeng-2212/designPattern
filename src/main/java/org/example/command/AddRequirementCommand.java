package org.example.command;

/**
 * 增加需求命令
 */
public class AddRequirementCommand extends Command{
    private final Group requirementGroup=new RequirementGroup();

    @Override
    void execute() {
        requirementGroup.find();
        requirementGroup.add();
        requirementGroup.plan();
    }

    @Override
    public String toString() {
        return "这是一条增加需求命令";
    }
}
