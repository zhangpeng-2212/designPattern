package org.example.flyweight;


/**
 * 享元模式中的基础实体类
 */
public class SignInfo {

    /**
     * 外部状态，可变
     * 地点，一共有10个可选值
     */
    private String location;

    /**
     * 外部状态，可变
     * 科目，一共有4个可选值
     */
    private String subject;

    /**
     * 内部状态，不可变，属于可以共享的部分
     */
    private final String name="dskhdkasjhdkg";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
}
