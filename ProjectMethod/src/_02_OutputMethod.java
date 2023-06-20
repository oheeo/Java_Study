import java.io.FileWriter;
import java.io.IOException;

public class _02_OutputMethod {

    public static void main(String[] args) throws IOException {

        System.out.println(printText("a", "-"));
        // 메소드 내에 System.out.println 가 있다면 출력하는 함수밖에 안되지만,
        // 함수에 return 값을 주고 함수 밖에서 그걸 출력하면
        // 함수를 출력하든지, 다른 무얼 하든지 여려 용도로 사용할 수 있게된다.

        FileWriter fw = new FileWriter("A.txt");
        fw.write(printText("a", "!"));
        fw.close();
//        Email.send("ekgml4122@com", "hello", printText("a", "*"));
        // 실제 존재하는 함수가 아니지만 이런식으로 확장할 수 있다는 뜻

    }
    public static String printText(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

}