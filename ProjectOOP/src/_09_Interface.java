//// 내가 예상하고 만든 더미 클래스
//class DummyCal {
//    public int sum(int v1, int v2) {
//        return 3;  // 더미니까 기능을 구현하진 않음
//    }
//}
//// (외주) 상대방이 구현한 클래스
//class RealCal {
//    public double sum(double v1, double v2, double v3) {
//        return v1+v2+v3;
//    }
//}
//
//public class _09_Interface {
//    public static void main(String[] args) {
//        // (외주) 더하기 기능이 있는 클래스를 만들어 주세요.
//        RealCal c = new RealCal();
//        System.out.println(c.sum(1,2));  // 내가 예상한 것과 상대방이 구현한 메서드 규칙이 달라서 오류남
//    }
//}

// 내가 필요한 메서드 : 입력값으로 정수 2개를 받고, 출력값도 정수로 받는
// 이 규칙에 Calculable 이라는 이름을 붙임
interface Carculable {
    double PI = 3.14;  // 잘 쓰진 않지만 인터페이스에서 변수도 정의할 수 있다
    int sum(int v1, int v2);
}
interface Printable {
    void print();
}

class RealCal implements Carculable, Printable {  // 위에 지정한 인터페이스 규칙을 안 지키면 오류남
    public int sum(int v1, int v2) {
        return v1+v2;
    }
    public void print() {
        System.out.println("This is Printable Interface");
    }
}

public class _09_Interface {
    public static void main(String[] args) {
        RealCal c = new RealCal();  // c는 RealCal 의 인스턴스를 가리킴. 그리고 데이터 타입은 RealCal
        System.out.println(c.sum(2,1));
        c.print();
        System.out.println(c.PI);  // 인터페이스에서 정의한 값 출력
        // Carculable c = new RealCal();  // c는 Carculable로써 동작함. 그래서 Printable에 있는 print() 못 씀
        // Printable c = new RealCal();  // c는 Printable로써 동작함. 그레서 Carculable에 있는 PI와 sum() 못 씀
        // 다형성 : 클래스가 어떤 데이터 타입을 지정하느냐에 따라 다양한 얼굴을 갖는다.
    }
}