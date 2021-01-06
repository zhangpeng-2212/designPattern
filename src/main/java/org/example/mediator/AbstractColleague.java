package org.example.mediator;

/**
 * 抽象部门，持有中介者的引用
 * 是销售部门、存货部门、采购部门的父类
 */
public class AbstractColleague {
    private AbstractMeditor abstractMeditor;

    public AbstractColleague(AbstractMeditor abstractMeditor) {
        this.abstractMeditor = abstractMeditor;
    }

    public AbstractMeditor getAbstractMeditor() {
        return abstractMeditor;
    }

    public void setAbstractMeditor(AbstractMeditor abstractMeditor) {
        this.abstractMeditor = abstractMeditor;
    }
}
