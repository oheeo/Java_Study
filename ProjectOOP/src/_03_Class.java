// MyOOP 에서 만든 line, printA, printB 는 연관돼있으니 이걸 하나의 클래스로 묶자

class Print{  // 클래스의 요소들을 넣는다
    public static String line = "";
    public static void A() {
        System.out.println(line);
        System.out.println("A");
        System.out.println("A");
    }
    public static void B() {
        System.out.println(line);
        System.out.println("B");
        System.out.println("B");
    }
}

public class _03_Class {

    public static void main(String[] args) {
        Print.line = "---";
        Print.A();  // Print 라는 클래스에 A
        Print.A();
        Print.line = "***";
        Print.B();
        Print.B();
    }

}

