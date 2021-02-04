package org.example.backup;

import java.util.Map;

/**
 * 需要被备份的对象
 */
public class Originator {
    private String str;
    private int num;

    public Originator() {

    }

    public Originator(String str, int num) {
        this.str = str;
        this.num = num;
    }

    //将当前对象的状态，生成一个备忘录对象
    public Memento createMemento() throws IllegalAccessException {
        Map<Object, Object> objectObjectMap = BeanUtils.backupProp(this, Originator.class);
        return new Memento(objectObjectMap);
    }

    //将当前对象的状态，恢复到一个备忘录时的状态
    public void restoreMemento(Memento memento) throws IllegalAccessException {
         BeanUtils.restoreProp(this, Originator.class, memento.getFieldMap());
    }



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "originator{" +
                "str='" + str + '\'' +
                ", num=" + num +
                '}';
    }
}
