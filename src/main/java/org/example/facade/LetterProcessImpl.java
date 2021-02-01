package org.example.facade;

/**
 * 写信实体类
 */
public class LetterProcessImpl implements ILetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("开始写信，信件的内容为："+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("拿出信封，写上邮件地址："+address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("将信件放入到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递员开始派送信件啦");
    }
}
