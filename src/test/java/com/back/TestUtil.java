package com.back;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestUtil {

    private static PrintStream ORIGIN_OUT = System.out;
    private static PrintStream CURRENT_OUT = System.out;

    public static Scanner genScanner(String input) {
        return new Scanner(input);

    }

    public static ByteArrayOutputStream setOutToByteArray() {
        ORIGIN_OUT = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        CURRENT_OUT = printStream;


        return  outputStream;
    }

    public static void clearSetOutToByteArray(ByteArrayOutputStream outputStream) throws IOException { //흐름을 복구 하는 함수
        System.setOut(ORIGIN_OUT);
        outputStream.close();
        CURRENT_OUT.close();
    }
}
