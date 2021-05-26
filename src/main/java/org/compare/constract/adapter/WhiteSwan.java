package org.compare.constract.adapter;

import org.compare.constract.decorate.Swan;

public class WhiteSwan implements Swan {
    @Override
    public void cry() {
        System.out.println("白天鹅叫声很好听");
    }

    @Override
    public void fly() {
        System.out.println("白天鹅会飞");
    }

    @Override
    public void appearance() {
        System.out.println("白天鹅长得很好看");
    }
}
