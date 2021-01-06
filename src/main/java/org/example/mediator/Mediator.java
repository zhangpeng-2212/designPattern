package org.example.mediator;

/**
 * 中介者实现类，主要处理其他部门交过来的任务，这些业务基本都是涉及到多个部门，所以交给中介者处理
 * 因为持有销售部门、存货部门、采购部门的引用，所以可以在内部通过引用来处理具体业务
 */
public class Mediator extends AbstractMeditor{
    @Override
    public void execute(MediatorSthEnum sthEnum, Object... objects) {
        switch (sthEnum){
            case BUY:
                this.buyComputer((Integer) objects[0]);
                break;
            case SELL:
                this.sellComputer((Integer) objects[0]);
                break;
            case OFFSELL:
                this.offSell();
                break;
            case CLEAR:
                this.clearStock();
                break;
            default:
                System.out.println("中介者处理不了的业务");
                break;
        }
    }


    //采购电脑
    private void buyComputer(int number){
        int saleStatus = super.getSale().getSaleStatus();
        if(saleStatus>80){ //销售情况良好
            System.out.println("公司批准采购电脑:"+number + "台");
            super.getStock().increase(number);
        }else{ //销售情况不好
            int buyNumber = number/2; //折半采购
            System.out.println("公司批准采购电脑："+buyNumber+ "台");
            super.getStock().increase(buyNumber);
        }
    }

    //销售电脑
    private void sellComputer(int number){
        if(super.getStock().getStockNumber()<number){ //库存数量不够销售
             super.getPurchase().buyComputer(number);
        }
        super.getStock().decrease(number);
    }

    //折价销售电脑
    private void offSell(){
        System.out.println("折价销售电脑"+super.getStock().getStockNumber()+"台");
    }

    //清仓处理
    private void clearStock(){ //要求清仓销售
        super.getSale().offSale(); //要求采购人员不要采购
        super.getPurchase().refuseBuyComputer();
    }
}
