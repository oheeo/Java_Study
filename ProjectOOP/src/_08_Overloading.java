class Cal3 {
    public int sum(int n1, int n2) {
        return n1+n2;
    }
//    // Overloading
//    public int sum(int n1, int n2, int n3) {
//        return n1+n2+n3;
//    }
}
class Cal4 extends Cal3 {
    public int minus(int n1, int n2) {
        return n1-n2;
    }
    // Overriding (부모클래스의 sum을 Overriding 함)
    public int sum(int n1, int n2) {
        System.out.println("Cal4에서 부모 메서드 수정함");
        return n1+n2;
    }
    // Overloading
    public int sum(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
}

public class _08_Overloading {
    public static void main(String[] args) {
        Cal3 c = new Cal3();
        System.out.println(c.sum(1,2));  // 3
//        System.out.println(c.sum(1,2,3));  // 6 -> Overloading

        Cal4 c2 = new Cal4();
        System.out.println(c2.minus(7,2));  // 5
        System.out.println(c2.sum(1,2));  // Cal4에서 부모 메서드 수정함 <- Overriding
        System.out.println(c2.sum(1,2,3));  // 6 -> Overloading
    }
}
