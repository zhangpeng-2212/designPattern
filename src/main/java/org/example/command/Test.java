package org.example.command;

public class Test {

    public static void main(String[] args) {

       Invoker invoker=new Invoker();

       invoker.acceptCommand(new AddRequirementCommand());

       invoker.action();
    }

}
