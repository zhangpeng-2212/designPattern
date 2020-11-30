package org.example.single;

/**
 * desc:皇帝类(饿汉式:加载时即存在)
 * author：zhangpeng
 */
public class Emperor {

    private String name;

    //final保证线程安全
    private static final Emperor  emperor=new Emperor("秦始皇");

    //私有的无参构造器
    private Emperor() {

    }
    //私有的有参构造器
    private Emperor(String name){
        this.name = name;
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void saySth(){
        System.out.println("我是："+name);
    }

}
