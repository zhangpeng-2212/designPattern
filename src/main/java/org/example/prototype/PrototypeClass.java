package org.example.prototype;


public class PrototypeClass implements Cloneable{

    private MyClass myClass;

    public PrototypeClass(MyClass myClass) {
        this.myClass = myClass;
    }

    public MyClass getMyClass() {
        return myClass;
    }

    public void setMyClass(MyClass myClass) {
        this.myClass = myClass;
    }

    /**
     * 调用super类（也就是object类）的clone方法实现对象的复制
     * 这是一种浅复制，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址
     * 若当前对象存在引用类型的属性时，其属性也要实现cloneable接口，进行深复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected PrototypeClass clone(){
        PrototypeClass cloneObj=null;

        try{
            cloneObj=(PrototypeClass)super.clone();
            if(cloneObj.myClass!=null){
                cloneObj.myClass=this.myClass.clone();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  cloneObj;
    }
}
