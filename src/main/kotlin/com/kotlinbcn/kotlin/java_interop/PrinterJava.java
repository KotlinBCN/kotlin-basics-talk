package com.kotlinbcn.kotlin.java_interop;

import java.util.concurrent.Callable;

public class PrinterJava {

    public void print(final String value) {
        System.out.println(value);
    }

    public void print(final Callable<String> callable) {
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
