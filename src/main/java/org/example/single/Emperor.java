package org.example.single;

/**
 * desc:皇帝类(饿汉式:加载时即存在)
 * author：zhangpeng
 */
public class Emperor {

    //final保证线程安全
    private static final Emperor  emperor=new Emperor();

    //私有的无参构造器
    private Emperor() {

    }

    public static Emperor getInstance() {
        return emperor;
    }


}
