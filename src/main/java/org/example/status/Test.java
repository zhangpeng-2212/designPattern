package org.example.status;

public class Test {
    public static void main(String[] args) {
        LeftContext context=new LeftContext();

        context.setLeftState(new LeftCloseState());
        context.open();
        context.run();
        context.close();
        context.run();
        context.open();
        context.stop();
    }
}
