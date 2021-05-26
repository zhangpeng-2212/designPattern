package org.compare.constract.decorate;

import org.compare.constract.adapter.DuckAdapter;
import org.compare.constract.adapter.WhiteSwan;

public class Test {

    public static void main(String[] args) {
        Swan samllDuck=new UglyDuck();
        samllDuck.cry();
        samllDuck.fly();
        samllDuck.appearance();

        System.out.println("==========丑小鸭发生了变化==========");
        samllDuck=new AppearanceDecoarte(samllDuck);
        samllDuck.appearance();


        System.out.println("==========适配成鸭子的白天鹅==========");
        DuckAdapter whiteSwan=new DuckAdapter();
        whiteSwan.fly();
        whiteSwan.appearance();

    }

}
