package org.example.strategy;

public class Test {
    public static void main(String[] args) {
        MyMath myMath=new MyMath(new MathAdd());
        myMath.operator(6, 5);

        myMath=new MyMath(new MathSub());
        myMath.operator(9, 7);

        myMath=new MyMath(new MathMultiple());
        myMath.operator(3, 4);

        System.out.println(Calculator.ADD.exec(1, 2));

    }

}
