package org.example.mediator;

/**
 * 抽象中介部门
 * 持有销售部门、存货部门、采购部门的引用
 */
public abstract class AbstractMeditor {
    private Purchase purchase;

    private Stock stock;

    private Sale sale;

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public AbstractMeditor() {
        this.purchase = new Purchase(this);
        this.stock = new Stock(this);
        this.sale = new Sale(this);
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(MediatorSthEnum sthEnum,Object... objects);
}
