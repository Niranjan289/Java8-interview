package com.niru.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandler {

    public static void main(String[] args) {
        System.out.println("\n Inside main()...");
        try {
            share();
            System.out.println("\n After share() invoking...");
        } catch (FileNotFoundException e) {
            System.out.println("main() - FileNotFoundException...");
            //throw new RuntimeException(e);
        }finally {
            System.out.println("main() - Finally block...");
        }
        System.out.println("\n End main()...");
    }

    public static void share() throws FileNotFoundException {
        System.out.println("\n Inside share()...");

        try {
            HttpConnector.send(0, "Hello", "https://google.com"); // try with 0, 1
            System.out.println("After invoking send()...");
        } catch (FileNotFoundException e) {
            System.out.println("share() - FileNotFoundException ");
            //e.printStackTrace();
            throw e;
        }catch (IOException e){
            //e.printStackTrace();
            System.out.println("Connecting to different server...");
        }finally {
            System.out.println("Inside share's finally...");
        }
        System.out.println("\n End share()...");
    }
}
