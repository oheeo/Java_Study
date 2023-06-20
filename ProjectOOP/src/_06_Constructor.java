public class _06_Constructor {

    public static void main(String[] args) {
        Print2 p1 = new Print2("---");  // Print2 클래스가 인스턴스화 될 때 "---" 를 인자로 받을것이고,
        p1.A();
        p1.B();

        Print2 p2 = new Print2("***");
        p2.A();
        p2.B();

        p1.A();
        p2.A();
        p1.A();
        p2.A();
    }
}

class Print2{
    public String line = "";
    public Print2(String line) {  // <-생성자! Print2 메소드의 매개변수로 line 을 받으면 됨. 생성자는 클래스 이름과 동일하게 Print2로 생성
        this.line = line;  // this 는 내가 생성한 인스턴스를 가리킴

//        public Print2(String line2) {
//            line = line2;
//        이렇게 써도 같지만 굳이 이름을 따로 지어서 구분할 필요 없이 앞의 line에 this를 붙이면 걔는 인스턴스를 가리키고, 뒤에 line은 생성자를 가리킴
    }
    public void A() {
        System.out.println(this.line);  // <-명시적으로 this를 적어서 누구를 지칭하는지 알려줌
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(this.line);
        System.out.println("B");
        System.out.println("B");
    }
}
