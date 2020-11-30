package org.example.app;

import org.example.single.Emperor;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
       for (int i = 0; i < 10;i++){
           Emperor emperor=Emperor.getInstance();
           emperor.saySth();
       }
    }
}
