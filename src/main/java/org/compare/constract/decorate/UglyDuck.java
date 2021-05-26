package org.compare.constract.decorate;

/**
 * 丑小鸭
 * 使用装饰模式就得承认丑小鸭的本质是天鹅
 */
public class UglyDuck implements Swan{
    @Override
    public void cry() {
        System.out.println("丑小鸭叫声不好听");
    }

    @Override
    public void fly() {
        System.out.println("丑小鸭不会飞");
    }

    @Override
    public void appearance() {
        System.out.println("丑小鸭长得不好看");
    }
}
