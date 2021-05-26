package org.compare.behavior.command;

public class Test {
    public static void main(String[] args) {
        AbstractCmd zipCommand=new ZipCompressCmd();

        Invoker invoker=new Invoker(zipCommand);

        invoker.executeCmd("c://a", "c://a.zip");


        invoker=new Invoker(new GzipUncompressCmd());
        invoker.executeCmd("c://a.zip", "c://a");


    }

}
