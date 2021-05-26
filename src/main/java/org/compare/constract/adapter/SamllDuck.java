package org.compare.constract.adapter;


/**
 * 鸭子实体类
 */
public class SamllDuck implements Duck{
    @Override
    public void cry() {
        System.out.println("鸭子的叫声难听");
    }

    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }

    @Override
    public void appearance() {
        System.out.println("鸭子也长得不好看");
    }
}
