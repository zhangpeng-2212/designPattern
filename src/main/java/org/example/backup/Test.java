package org.example.backup;


public class Test {
    public static void main(String[] args) {



        try {
            Originator originator1=new Originator("张三",25);
            System.out.println("状态1："+originator1.toString());

            //进行备份，可以添加一个备份管理员对象，将备份对象储存起来，这样可以做到多备份
            Memento memento = originator1.createMemento();

            originator1.setStr("李四");
            originator1.setNum(30);
            System.out.println("状态2："+originator1.toString());

            //恢复备份
            originator1.restoreMemento(memento);
            System.out.println("状态3："+originator1.toString());

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
