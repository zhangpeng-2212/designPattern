package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点，继承自基础组件
 */
public class Composite extends Component{
    private List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component){
        if(components.contains(component)){
            components.remove(component);
        }
    }

    public List<Component> getComponents() {
        return components;
    }


    @Override
    public void doSth() {
        System.out.println("I am a branch");
    }
}
