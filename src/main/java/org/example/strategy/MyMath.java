package org.example.strategy;

/**
 * 计算器类，供客户端调用
 * 含有一个实现类的属性
 */
public class MyMath{
    private IMath math;

    public MyMath(IMath math) {
        this.math = math;
    }

    /**
     * 调用具体实现类的方法
     */
    public void operator(int a, int b) {
        math.operator(a, b);
    }
}
