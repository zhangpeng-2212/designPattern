package org.example.facade;

/**
 * 邮局的送检员，检查信件是否和标
 */
public class Poster {

    //检查信封
    public void checkLetter(ILetterProcess process){
        System.out.println(process+"信件达标");
    }

}
