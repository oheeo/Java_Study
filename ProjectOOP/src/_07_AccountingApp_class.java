class Accounting1 {
    public static double valueOfSupply;
    public static double vatRate = 0.1;
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class _07_AccountingApp_class {

    public static void main(String[] args) {
        Accounting1.valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + Accounting1.valueOfSupply);
        System.out.println("VAT : " + Accounting1.getVAT());
        System.out.println("Total : " + Accounting1.getTotal());
        // Accounting1 에 관련된 코드를 클래스로 묶고, 그걸 쓸 땐 Accounting1.getTotal() 이렇게 쓰면
        // getTotal 이라는 흔한 이름에서 좀 더 명확한 이름이 된다.
        // getTotal 이라는 메서드가 다른 클래스에도 있다면, 앞에 클래스 이름을 붙임으로써 공존할 수 있다.
    }
}
