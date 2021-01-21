package org.example.decorator;

/**
 * 四年级成绩单
 */
public class FouthGradeSchoolReport extends Repotor{
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void signName(String name) {
        System.out.println("家长签名为："+name);
    }
}
