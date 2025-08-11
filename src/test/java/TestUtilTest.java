import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
