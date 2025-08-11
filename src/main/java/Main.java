import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        experiment();
        experiment2();
    }

    public static void experiment2(){   //모니터로 나가야하는 "하하하"가 나에게 돌아오게 하는법
        //
        System.out.println("안녕하세요");

        PrintStream originOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();   //출력될 값을 담아두는 곳
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream); //흐름을 모니터에서 printStream (ByteArrayOutputStream outputStream)으로 바꿈
                                    //쉽게말해 모니터에서 내 저장소(임의로 지은 이름임) 로 흐름을 바꿈

        System.out.println("하하하");  //흐름이 모니터 방향이 아니기때문에 출력되지않음

        String outStr = outputStream.toString();    //값을 꺼냄
        System.out.println(outStr); //현재 흐름이 내 저장소로 되어있기 때문에 다시 원래대로 바꿔야 모니터에 출력할수있ㅇ음
        printStream.close();


        System.out.println(outStr);

    }

    public static void experiment(){    //키보드로 입력받지 않고 선입력 하는 방법
        String input = """
        등록
        너 자신을 알라
        """;
        Scanner sc = new Scanner(input);

        String cmd = sc.nextLine();
        String saying = sc.nextLine();

        System.out.println("입력한 명령어 : " + cmd);
        System.out.println("입력한 명언 : " + saying);

    }
}
