//public class _01_WhyMethod {
//
//    public static void main(String[] args) {
//        printA();
//        printA();
//        printA();
//        printB();
//    }
//
//    public static void printA() {
//        System.out.println("---");
//        System.out.println("A");
//        System.out.println("A");
//    }
//    public static void printB() {
//        System.out.println("---");
//        System.out.println("B");
//        System.out.println("B");
//    }
//}
// 반복되는 여러 코드를 묶어서 하나의 메소드로 만든다. main 도 메소드
// 그런데 A 와 B 문자열만 다를뿐 같은 내용이 반복된다면? 이걸 하나의 메소드로 합칠 수 없을까?

//public class _01_WhyMethod {
//
//    public static void main(String[] args) {
//        printText("A");
//        printText("A");
//        printText("A");
//        printText("B");
//    }
//
//    public static void printText(String text) {
//        System.out.println("---");
//        System.out.println(text);
//        System.out.println(text);
//    }
//}
// "---" 구분자도 각각 다르게 주고 싶다면?

public class _01_WhyMethod {

    public static void main(String[] args) {
        printText("A", "-");
        printText("A", "*");
        printText("A", "^");
        printText("B", "/");
    }

    public static void printText(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}