package org.example.mediator;

public class Test {
    public static void main(String[] args) {
        AbstractMeditor mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        //销售人员销售电脑
        System.out.println("------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(10);

        //库房管理人员管理库存
        System.out.println("------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
