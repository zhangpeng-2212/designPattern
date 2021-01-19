package org.example.responsibilityChain;

/**
 * 底层小员工
 */
public class BottomEmp extends Employer{


    public BottomEmp() {
        super(LevelEnum.BOTTOM, new DirectorEmp());
    }

    /**
     * 处理请求
     */
    public void myResponse() {
        System.out.println("我是底层员工，我可以批准请求");
    }

}
