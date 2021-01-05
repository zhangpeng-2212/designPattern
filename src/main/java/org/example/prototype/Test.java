package org.example.prototype;

public class Test {
    public static void main(String[] args) {
        PrototypeClass prototypeClass=new PrototypeClass(new MyClass("张三"));
        PrototypeClass cloneClass=prototypeClass.clone();

        System.out.println(prototypeClass==cloneClass);
        System.out.println(prototypeClass.getMyClass()==cloneClass.getMyClass());
        System.out.println(cloneClass.getMyClass().getName());

    }


}
