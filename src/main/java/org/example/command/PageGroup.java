package org.example.command;

/**
 * 美工部门
 */
public class PageGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到美工部门");
    }

    @Override
    public void add() {
        System.out.println("满足客户增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("满足客户删除一个页面");
    }

    @Override
    public void update() {
        System.out.println("满足客户修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("满足客户页面重新排期");
    }
}
