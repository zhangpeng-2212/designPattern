package org.example.command;

/**
 * 部门父类，定义部门的固有方法
 */
public abstract class Group {

    /**
     * 找到该部门
     */
    abstract void find();

    /**
     * 新增
     */
    abstract void add();

    /**
     * 删除
     */
    abstract void delete();

    /**
     * 修改
     */
    abstract void update();

    /**
     * 排期计划
     */
    abstract void plan();
}
