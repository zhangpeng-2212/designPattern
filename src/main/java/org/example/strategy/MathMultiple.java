package org.example.strategy;

/**
 * 乘法
 */
public class MathMultiple implements IMath{
    @Override
    public void operator(int a, int b) {
        System.out.println(a+"*"+b+"="+(a*b));
    }
}
