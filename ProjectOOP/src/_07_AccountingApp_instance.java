//class Accounting2 {
//    public static double valueOfSupply;
//    public static double vatRate = 0.1;
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//}
//
//public class _07_AccountingApp_instance {
//
//    public static void main(String[] args) {
//        Accounting2.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting2.valueOfSupply);
//        System.out.println("VAT : " + Accounting2.getVAT());
//        System.out.println("Total : " + Accounting2.getTotal());
//
//        Accounting2.valueOfSupply = 20000.0;
//        System.out.println("Value of supply : " + Accounting2.valueOfSupply);
//        System.out.println("VAT : " + Accounting2.getVAT());
//        System.out.println("Total : " + Accounting2.getTotal());
//    }
//}
// 이렇게 클래스의 형태의 변화(공급가액, VAT, Total)가 필요 없다면 상관 없지만
// Value of supply : 10000.0
// Value of supply : 20000.0
// VAT : 1000.0
// VAT : 2000.0
// 이런식으로 형태의 변화가 필요할 땐 인스턴스화

class Accounting2 {
    public double valueOfSupply;  // 인스턴스에 소속된 거니까 static 제거
    public Accounting2(double valueOfSupply) {  // 생성자로 valueOfSupply 를 꼭 넣으라고 강조하기
        this.valueOfSupply = valueOfSupply;
    }
    public static double vatRate = 0.1;  // 부가가치세율은 어떤 인스턴스든 동일하기에 인스턴스소속보다는 class 소속이 낫다
    public double getVAT() {  // 인스턴스의 valueOfSupply 에 접근하려면 static 이면 안 됨 (static은 클래스 소속)
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class _07_AccountingApp_instance {

    public static void main(String[] args) {
        Accounting2 a1 = new Accounting2(10000.0);

        Accounting2 a2 = new Accounting2(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);

        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());

        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());

    }
}
