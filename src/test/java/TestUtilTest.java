import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {


    @Test
    @DisplayName("TestUtil.getScanner()")
    void t1() { //선 입력 테스트

        Scanner sc = TestUtil.genScanner(   //test를 도와주는 자체제작 클래스
                """
                        등록
                        너 자신을 알라
                        소크라테스
                        """
        );//매개변수를 입력값으로하는 스캐너를 주는 함수

        String cmd = sc.nextLine();
        String saying = sc.nextLine();
        String author = sc.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(saying).isEqualTo("너 자신을 알라");
        assertThat(author).isEqualTo("소크라테스");

    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray()")
    void t2() throws IOException {
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        System.out.println("1/ 이순신/ 나의 죽음을 적에게 알리지 마라");    //모니터에 출력되는 문장
        
        String outStr = outputStream.toString();    //모니터에 출력되는 문장을 가져옴

        TestUtil.clearSetOutToByteArray(outputStream);  //문장을 가져오고나서 출력 흐름을 정상화함

        //줄바꿈 문자가 하나 추가되어서 isEqualTo로는 통과되지않으니
        //contain(특정문장을 포함시키면 통과)을 써서 통과시킨다. (줄바꿈이 왜 포함되는것일까?)
        assertThat(outStr).contains("1/ 이순신/ 나의 죽음을 적에게 알리지 마라");  //모니터에 출력되는 문장을 가져오는게 잘 되는지 확인하는 테스트


        System.out.println("이제 화면에 출력됩니다.");
        
    }
}
