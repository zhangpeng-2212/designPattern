package org.example.facade;

public class Test {

    public static void main(String[] args) {
        String context="你好，见信如晤！";
        String address="浙江省杭州市";

        PostOffice postOffice=new PostOffice(new LetterProcessImpl(), new Poster());
        postOffice.postLetter(context, address);



    }

}
