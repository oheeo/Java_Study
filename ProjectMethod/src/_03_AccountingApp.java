//public class _03_AccountingApp {
//    public static void main(String[] args) {
//        // 공급가액
//        double valueOfSupply = 10000.0;
//        // 부가가치세율 10%
//        double vatRate = 0.1;
//        // 부가세 = 공급가액 x 10%
//        double vat = valueOfSupply * vatRate;  // 이 코드가 일얼줄이라면?
//        // 합계 = 부가세 + 공급가액
//        double total = valueOfSupply + vat;
//
//        System.out.println("Value of supply : " + valueOfSupply);
//        System.out.println("VAT : " + vat);
//        System.out.println("Total : " + total);
//    }
//}

public class _03_AccountingApp {

    public static double valueOfSupply;
    public static double vatRate = 0.1;
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
    public static void main(String[] args) {
        valueOfSupply = 10000.0;
//        double vat = getVAT();  // 메소드를 이용함으로써 코드가 간결해지고 수정이 용이해짐. 그리고 메소드 이름을 붙여주니까 용도 파악이 쉽다.
//        double total = getTotal();  // 이미 메소드로 정의했기에 굳이 변수 이름을 붙일 필요 없다.

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
    }
}
