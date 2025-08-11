package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import static org.assertj.core.api.Assertions.assertThat;
public class AppTest {

    @Test
    @DisplayName("==명언 앱 == '출력'")
    void t1(){
        Scanner sc = TestUtil.genScanner("종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        new App(sc).run();  //여기서  "==명언 앱 == '출력'"을 넣게됨

        String out = outputStream.toString();
        assertThat(out).contains("==명언 앱==");

    }
}
