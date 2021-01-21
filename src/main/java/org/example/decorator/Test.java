package org.example.decorator;

public class Test {
    public static void main(String[] args) {
        //四年级成绩单
        Repotor repotor=new FouthGradeSchoolReport();

        //成绩装饰器
        repotor=new HighScoreDecorator(repotor);

        //排名装饰器
        repotor=new SortDecorator(repotor);

        //汇报成绩
        repotor.report();

        //签名
        repotor.signName("张三");
    }

}
