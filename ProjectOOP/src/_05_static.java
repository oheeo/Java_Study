// Foo 라는 class 를 만들고
// classVar 라는 변수 (static이 붙어서 class 소속)
// instanceVar 라는 변수 를 넣는다.
// static 메소드와
// instance 메소드를 만든다.
class Foo {
public static String classVar = "I class var";  // 클래스 변수
public String instanceVar = "I instance var";  // 인스턴스 변수
public static void classMethod() {  // 클래스 메소드
    System.out.println(classVar);  // 접근 가능
//    System.out.println(instanceVar);  // 인스턴스 변수에 접근 불가능
}
public void instanceMethod() {  // 인스턴스 메소드
    System.out.println(classVar);  // 접근 가능
    System.out.println(instanceVar);  // 접근 가능
}
}

public class _05_static {

    public static void main(String[] args) {
        System.out.println(Foo.classVar);  // 클래스를 통해서 클래스 변수에 접근 가능한가? OK
//        System.out.println(Foo.instanceVar);  // 클래스를 통해서 인스턴스 변수에 접근 가능한가? -> 인스턴스는 인스턴스로 접근 가능
        Foo.classMethod();  // Foo의 클래스 메소드 접근 가능
//        Foo.instanceMethod();  // Foo의 인스턴스 메소드 접근 불가능
        // 결론 : 인스턴스 변수나 인스턴스 메소드는 인스턴스 소속이기때문에 클래스를 통해서 접근할 수 없다.

        Foo f1 = new Foo();  // Foo 클래스를 f1 변수에 넣어서 인스턴스화
        Foo f2 = new Foo();  // Foo 클래스를 f2 변수에 넣어서 인스턴스화

        System.out.println(f1.classVar);  // I class var
        System.out.println(f1.instanceVar);  // i instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);  // changed by f1
        System.out.println(f2.classVar);  // changed by f1

        f2.instanceVar = "changed by f2";
//        System.out.println(Foo.instanceVar);  // 접근 불가능
        System.out.println(f1.instanceVar);  // I instance var
    }
}
