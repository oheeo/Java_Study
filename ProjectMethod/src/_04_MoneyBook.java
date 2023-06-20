public class _04_MoneyBook {

    public static int importation = 10000;
    public static int expense = 3000;
    public static int getTotal() {
        return importation - expense;
    }

    public static void main(String[] args) {
        System.out.println("수입 : " + importation);
        System.out.println("지출 : " + expense);
        System.out.println("Total : " + getTotal());
    }

}
