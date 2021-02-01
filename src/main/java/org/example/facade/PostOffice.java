package org.example.facade;


/**
 * 邮局门面，主要负责派送信件和检查信件
 * 关联写信过程和邮递员，只对外开放一个方法，这样客户端只要告知信件内容和邮寄地址
 * 该门面即可完成整个信件过程，而不需要自己去完成整个过程
 */
public class PostOffice {
    private ILetterProcess letterProcess;
    private Poster poster;

    public PostOffice(ILetterProcess letterProcess, Poster poster) {
        this.letterProcess = letterProcess;
        this.poster = poster;
    }


    public void postLetter(String context,String address){
        letterProcess.writeContext(context);

        letterProcess.fillEnvelope(address);

        poster.checkLetter(letterProcess);

        letterProcess.letterInotoEnvelope();

        letterProcess.sendLetter();
    }

}
