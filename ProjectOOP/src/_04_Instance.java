//    public static void main(String[] args) {
//        Print.line = "---";  // Print 라는 클래스의 "---"
//        Print.A();
//        Print.B();
//        Print.line = "***";
//        Print.B();
//        Print.B();
//        Print.line = "---";  // 이런식으로 계속 바꿔야할때 우리를 구원할 인스턴스
//        Print.A();
//        Print.line = "***";
//        Print.B();
//    }
//}
//class Print1{
//    public static String line = "";  // static 뒤에 오는 String 은 class Print1 소속
//    public static void A() {
//        System.out.println(line);
//        System.out.println("A");
//        System.out.println("A");
//    }
//    public static void B() {
//        System.out.println(line);
//        System.out.println("B");
//        System.out.println("B");
//    }
//}

public class _04_Instance {

    public static void main(String[] args) {
        Print1 p1 = new Print1();
        p1.line = "---";    // Print1 라는 인스턴스의 "---"
        p1.A();
        p1.B();

        Print1 p2 = new Print1();
        p2.line = "***";    // Print1 라는 인스턴스의 "***"
        p2.A();
        p2.B();

        p1.A();
        p2.A();
        p1.A();
        p2.A();
    }
}
class Print1{
    public String line = "";  // static 을 없애면 String 은 인스턴스 소속
    public void A() {  // static 은 클래스 소속, 없애야 인스턴스 소속
        System.out.println(line);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(line);
        System.out.println("B");
        System.out.println("B");
    }
}


