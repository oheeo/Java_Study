import java.io.FileWriter;
import java.io.IOException;

public class _01_OthersOOP {

    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2
        System.out.println(Math.PI);  // 3.141592653589793
        System.out.println(Math.floor(1.8));  // 1.0 내림
        System.out.println(Math.ceil(1.8));  // 2.0 올림

        // Math 라는 class 안에는 수학과 관련된 변수(PI), 메소드(floor, ceil) 가 있다
        // 코드가 많아짐에 따라서 서로 연관된 변수와 메소드를 그룹핑한 껍데기 = 클래스
        // 클래스를 한번만 쓸 때는 위에처럼 써도 되지만 아래처럼 긴 작업을 수행할 땐 new 를 붙여 복제본을 만들어 사용한다

        FileWriter f1 = new FileWriter("data.txt");
        // FileWriter 은 파일을 수정해주는데 "data.tex"라는 파일을 지정하고
        // 앞에 new 를 붙이면 "data.txt 에다가 파일을 저장하겠다" 라고 하는 상태를 가진 FileWriter 라는 클래스의 복제본이 생기고
        // 이 복제본을 f1 이라는 변수에 담고
        // 이 복제본의 데이터 타입은 클래스 이름인 FileWriter
        // FileWriter 은 기본적으로 자바lang에 속하지 않아서 import 해줘야함
        f1.write("Hello");
        f1.write("Java");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        // FileWriter 의 또 다른 복제본인 f2 를 만듦
        f2.write("Hello");
        f2.write("Java");
        f2.close();
    }
}
