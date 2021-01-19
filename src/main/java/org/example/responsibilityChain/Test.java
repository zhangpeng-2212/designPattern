package org.example.responsibilityChain;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random = new Random();

        Employer asker=getEmployer(random.nextInt(4));
        System.out.println("请求者是"+asker.getLevel().getMessage());

        Employer rsper=getEmployer(random.nextInt(4));
        System.out.println("答复者是"+rsper.getLevel().getMessage());

        rsper.askHigher(asker.getLevel().getCode());
    }

    private static Employer getEmployer(int code){
        System.out.println(code);
        if(code==1){
            return new BottomEmp();
        }else if(code==2){
            return new DirectorEmp();
        }else if(code==3){
            return new BossEmp();
        }
        return new BottomEmp();
    }

}
