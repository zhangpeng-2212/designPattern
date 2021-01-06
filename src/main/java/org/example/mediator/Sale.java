package org.example.mediator;

import java.util.Random;

/**
 * 销售部门
 * 主要是销售电脑,涉及到其他部门的业务交给中介者类来做
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMeditor abstractMeditor) {
        super(abstractMeditor);
    }

    //销售IBM电脑
    public void sellComputer(int number){
        super.getAbstractMeditor().execute(MediatorSthEnum.SELL, number);
        System.out.println("销售部卖出电脑"+number+"台");
    }

    //反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale(){
        super.getAbstractMeditor().execute(MediatorSthEnum.OFFSELL);
    }

}
