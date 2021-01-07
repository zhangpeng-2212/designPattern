package org.example.command;

/**
 * 需求部门
 */
public class RequirementGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到需求部门");
    }

    @Override
    public void add() {
        System.out.println("满足客户增加一条需求");
    }

    @Override
    public void delete() {
        System.out.println("满足客户删除一条需求");
    }

    @Override
    public void update() {
        System.out.println("满足客户修改一条需求");
    }

    @Override
    public void plan() {
        System.out.println("满足客户需求重新排期");
    }
}
