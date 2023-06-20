class Cal5 {
    public int sum(int n1, int n2) {
        return n1+n2;
    }
    // Overloading
    public int sum(int n1, int n2, int n3) {
        // return n1+n2+n3;
        return this.sum(n1,n2) + n3;  // n1+n2는 Cal5(자기자신)의 매개변수니까 명시적으로 this 적어줌
        // -> Cal5의 public int sum(int n1, int n2) { return n1+n2; } 을 실행 후,
        // 여기에 +n3 을 진행함
    }
}
class Cal6 extends Cal5 {
    public int minus(int n1, int n2) {
        return n1-n2;
    }
    // Overriding (부모클래스의 sum을 Overriding 함)
    public int sum(int n1, int n2) {
        System.out.println("Cal4에서 부모 메서드 수정함");
        return super.sum(n1,n2);  // super은 부모클래스를 가리킴
    }
}

public class _08_this_super {
    public static void main(String[] args) {
        Cal5 c = new Cal5();
        System.out.println(c.sum(1,2));  // 3
        System.out.println(c.sum(1,2,3));  // 6 -> Overloading

        Cal6 c2 = new Cal6();
        System.out.println(c2.minus(7,2));  // 5
        System.out.println(c2.sum(1,2));  // Cal4에서 부모 메서드 수정함 <- Overriding
    }
}
