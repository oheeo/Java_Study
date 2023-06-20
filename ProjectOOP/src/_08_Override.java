class Parent {
    public void hello(String name) {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}

class Child extends Parent{
    @Override  // 명시적으로 적으며, 있으면 매개변수를 빠뜨렸다든지, 메서드명이 틀렸다든지 할 때 컴파일 시 알려준다.
    public void hello(String name) {
        System.out.println("안녕!");
    }
}

public class _08_Override {
    public static void main(String[] args) {
        Child ccc = new Child();
        ccc.hello("hee");
    }
}
