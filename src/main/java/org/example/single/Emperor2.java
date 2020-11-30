package org.example.single;

/**
 * desc:皇帝类（懒汉式：懒加载，需要时才去创建）
 * author：zhangpeng
 */
public class Emperor2 {

    private static Emperor2 emperor=null;

    //私有的无参构造器
    private Emperor2() {

    }
    //没有synchronized时存在多线程问题，有可能一个线程在第26行的时候，一个线程才进行到第25行，导致多次生成新的对象
    public synchronized static Emperor2 getInstance() {
        if(emperor == null){
            emperor = new Emperor2();
        }
        return emperor;
    }

}
