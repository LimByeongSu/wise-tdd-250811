package com.back;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {    //테스트에서 반복적으로 나오는 부분을 여기에 넣음

    public static String run(String input){
        Scanner sc = TestUtil.genScanner(input);

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        new App(sc).run();

        return outputStream.toString();
    }

}
