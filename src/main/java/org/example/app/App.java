package org.example.app;

import org.example.single.Emperor3;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
       for (int i = 0; i < 10;i++){
           Emperor3 emperor= Emperor3.getInstance();
           System.out.println(emperor.toString());
       }
    }
}
