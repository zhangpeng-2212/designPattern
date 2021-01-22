package org.example.strategy;

/**
 * 减法
 */
public class MathSub implements IMath{
    @Override
    public void operator(int a, int b) {
        System.out.println(a+"-"+b+"="+(a-b));
    }
}
