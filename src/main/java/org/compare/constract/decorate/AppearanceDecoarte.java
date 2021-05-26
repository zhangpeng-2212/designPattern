package org.compare.constract.decorate;


/**
 * 外表装饰器，继承装饰类父类，重写外表方法
 */
public class AppearanceDecoarte extends MyDecoratorFat{
    public AppearanceDecoarte(Swan swan) {
        super(swan);
    }

    @Override
    public void appearance() {
        System.out.println("丑小鸭的外表是纯白色的，非常惹人喜爱！");
    }
}
