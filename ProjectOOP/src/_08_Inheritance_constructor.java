class Cal7 {
    int n1,n2;
    Cal7(int n1, int n2) {
        System.out.println("Cal7 추가함");
        this.n1 = n1;
        this.n2 = n2;
    }
    // 부모클래스에서 생성자를 만들었다면 반드시 자식 클래스에서 호출해야한다.
    public int sum() { return this.n1 + this.n2; }  // 더이상 인자를 갖지 않음
}
class Cal8 extends Cal7 {
    Cal8(int n1, int n2) {
        super(n1, n2);
        // 부모클래스의 생성자인 Cal7(int n1, int n2) { this.n1 = n1; this.n2 = n2;} 를 실행함
        System.out.println("Cal8 추가함");
    }
    public int minus() { return this.n1 - this.n2; }
}

public class _08_Inheritance_constructor {
    public static void main(String[] args) {
        Cal7 c = new Cal7(2,1);  // Cal7 추가함
        Cal8 c1 = new Cal8(2,1);  // Cal7 추가함 Cal8 추가함

        System.out.println(c1.sum());  // 3
        System.out.println(c1.minus());  // 1
    }
}
