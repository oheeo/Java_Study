class Cal {
    public int sum(int n1, int n2) {
        return n1+n2;
    }
}
class Cal2 extends Cal {
    public int minus(int n1, int n2) {
        return n1-n2;
    }
    @Override  // Overriding (부모클래스의 sum 을 Overriding 함)
    public int sum(int n1, int n2) {
        System.out.println("Cal2에서 부모 메서드 수정함");
        return n1+n2;
    }
}

public class _08_Inheritance_Overriding {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(1,2));  // 3

        Cal2 c2 = new Cal2();
        System.out.println(c2.minus(7,2));  // 5
        System.out.println(c2.sum(1,2));  // Cal4에서 부모 메서드 수정함 <- Overriding
    }
}
