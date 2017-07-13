package com.kotlinbcn.kotlin.java_interop;

import java.util.function.Function;

public class JavaInterop {

    public static void main(final String[] args) {
        final PrinterKotlin printer = new PrinterKotlin();

        printer.print("Jose Luis Franconetti");
        printer.print(() -> "Jose Luis Franconeti");
    }
}
