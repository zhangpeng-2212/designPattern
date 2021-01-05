package org.example.prototype;

/**
 * 测试引用属性的类
 */
public class MyClass implements Cloneable{
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected MyClass clone() throws CloneNotSupportedException {
        return (MyClass)super.clone();
    }
}
