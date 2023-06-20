//public class _02_MyOOP {
//    public static void main(String[] args) {
//        printA();
//        printA();
//        printB();
//        printB();
//    }
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

//public class _02_MyOOP {
//    public static void main(String[] args) {
//        printA("---");
//        printA("---");
//        printB("***");
//        printB("***");
//    }
//    public static void printA(String line) {
//        System.out.println(line);
//        System.out.println("A");
//        System.out.println("A");
//    }
//    public static void printB(String line) {
//        System.out.println(line);
//        System.out.println("B");
//        System.out.println("B");
//    }
//}

//public class _02_MyOOP {
//    public static void main(String[] args) {
//        String line = "---";
//        printA(line);
//        printA(line);
//        line = "***";
//        printB(line);
//        printB(line);
//    }
//    public static void printA(String line) {
//        System.out.println(line);
//        System.out.println("A");
//        System.out.println("A");
//    }
//    public static void printB(String line) {
//        System.out.println(line);
//        System.out.println("B");
//        System.out.println("B");
//    }
//}

public class _02_MyOOP {

    public static void main(String[] args) {
        line = "---";
        printA();
        printA();
        line = "***";
        printB();
        printB();
    }
    public static String line = "";
    public static void printA() {
        System.out.println(line);  // 이건 main 메소드가 아닌 그 위에 MyOOP 에 속한 line (printA 라는 메소드에는 line 이라는 변수가 선언돼있지 않으니까 그 위인 MyOOP 에서 찾아옴)
        System.out.println("A");
        System.out.println("A");
    }
    public static void printB() {
        System.out.println(line);
        System.out.println("B");
        System.out.println("B");
    }
}
