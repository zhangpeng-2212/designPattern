package org.example.composite;

/**
 * 叶子组件，继承自基础组件
 */
public class Leaf extends Component{

    /**
     * 可以覆盖父类的方法，也可以不覆盖
     */
    @Override
    public void doSth() {
        System.out.println("I am a left");
    }

}
