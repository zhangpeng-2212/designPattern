package org.example.single;

/**
 * desc:皇帝类
 * （使用静态内部类延迟加载,外部类加载时不会加载内部类，当需要时调用getInstance()方法，继而使静态内部类实现加载
 *  不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化）
 * author：zhangpeng
 */
public class Emperor3 {
    private Emperor3 emperor=null;

    //私有的无参构造器
    private Emperor3() {

    }

    public static Emperor3 getInstance(){
        return Emperor3Holder.INSTANCE;
    }

    private static class Emperor3Holder{
        private static Emperor3 INSTANCE=new Emperor3();
    }

}
