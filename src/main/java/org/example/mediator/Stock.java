package org.example.mediator;

/**
 * 存货部门
 * 主要登记电脑的进出,涉及到其他部门的业务交给中介者类来做
 */
public class Stock extends AbstractColleague{
    public Stock(AbstractMeditor abstractMeditor) {
        super(abstractMeditor);
    }

    //刚开始有100台电脑
    private static int COMPUTER_NUMBER =100;

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("电脑库存数量为："+COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("电脑库存数量为："+COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.getAbstractMeditor().execute(MediatorSthEnum.CLEAR);
    }

}
