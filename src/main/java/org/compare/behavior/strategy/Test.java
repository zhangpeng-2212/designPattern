package org.compare.behavior.strategy;

public class Test {

    public static void main(String[] args) {
        Context context=new Context(new Zip());

        context.doCompress("c://a", "c://a.zip");
        context.doUnCompress("c://a.zip", "c://a");


        context=new Context(new Gzip());

        context.doCompress("c://a", "c://a.zip");
        context.doUnCompress("c://a.zip", "c://a");

    }

}
