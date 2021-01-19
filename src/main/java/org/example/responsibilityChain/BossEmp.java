package org.example.responsibilityChain;

public class BossEmp extends Employer{
    public BossEmp() {
        super(LevelEnum.BOSS, null);
    }

    /**
     * 处理请求
     */
    public void myResponse() {
        System.out.println("我是大老板，我可以批准请求");
    }
}
