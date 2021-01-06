package org.example.mediator;

/***
 * 采购部门,继承AbstractColleague类，
 * 主要做采购电脑的业务,涉及到其他部门的业务交给中介者类来做
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMeditor abstractMeditor) {
        super(abstractMeditor);
    }


    //采购电脑
    public void buyComputer(int number){
        System.out.println("采购部准备采购"+number+"台电脑");
        super.getAbstractMeditor().execute(MediatorSthEnum.BUY, number);
    }

    //不再采购电脑
    public void refuseBuyComputer(){
        System.out.println("不再采购电脑");
    }

}
