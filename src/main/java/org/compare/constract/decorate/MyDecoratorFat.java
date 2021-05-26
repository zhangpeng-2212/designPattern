package org.compare.constract.decorate;


/**
 * 装饰器父类，也实现swan接口，并且传入被装饰的对象
 */
public class MyDecoratorFat implements Swan{
    private Swan swan;

    public MyDecoratorFat(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void appearance() {
        swan.appearance();
    }
}
