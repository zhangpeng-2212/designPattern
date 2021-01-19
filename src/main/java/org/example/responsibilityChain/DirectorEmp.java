package org.example.responsibilityChain;

public class DirectorEmp extends Employer{
    public DirectorEmp() {
        super(LevelEnum.DIRECTOR, new BossEmp());
    }

    /**
     * 处理请求
     */
    public void myResponse() {
        System.out.println("我是主管，我可以批准请求");
    }
}
