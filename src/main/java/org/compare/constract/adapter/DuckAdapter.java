package org.compare.constract.adapter;


/**
 * 鸭子装饰器，重载了鸭子的原方法
 * 这里演示就只展示一个方法
 */
public class DuckAdapter extends WhiteSwan implements Duck {
    @Override
    public void appearance() {
        System.out.println("这只白天鹅长得不好看");
    }
}
