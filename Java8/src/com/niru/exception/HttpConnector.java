package com.niru.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnector {

    public static void send(int destination, String data, String patner) throws IOException {
        System.out.println("\n Inside send()...");

        if(destination < 0 || destination > 1){
            throw new IllegalArgumentException();
        }

        if(destination == 0) {
            throw new FileNotFoundException();
        } else if(destination == 1){
            throw new IOException();
        }
        System.out.println("\n End send()...");
    }
}
