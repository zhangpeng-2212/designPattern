package org.example.composite;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //根节点
        Composite root=new Composite();

        //枝节点
        Composite branch=new Composite();

        //叶节点
        Leaf left1=new Leaf();
        Leaf left2=new Leaf();


        branch.addComponent(left1);
        branch.addComponent(left2);
        root.addComponent(branch);


        display(root);
    }

    public static void display(Composite composite){
        List<Component> components = composite.getComponents();
        components.forEach(component -> {
            if(component instanceof Leaf){
                component.doSth();
                return;
            }
            display((Composite) component);
        });

    }

}
