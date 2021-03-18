package org.example.bridge;

public class Phone extends Product{
    @Override
    void beProducted() {
        System.out.println("==========生产手机");
    }

    @Override
    void beSelled() {
        System.out.println("==========销售手机");
    }
}
