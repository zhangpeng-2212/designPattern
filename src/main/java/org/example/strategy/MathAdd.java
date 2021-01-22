package org.example.strategy;

/**
 * 加法
 */
public class MathAdd implements IMath{
    @Override
    public void operator(int a, int b) {
       System.out.println(a+"+"+b+"="+(a+b));
    }
}
