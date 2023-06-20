public class AuthApp {

    public static void main(String[] args) {

        String id = "hee";
        String inputId = args[0];  // program arguments 에 hee 추가함

        String pass = "1234";
        String inputPass = args[1];  // program arguments 에 1234 추가함

        System.out.println("Hi");

        // if(inputId == id) {   // 이렇게 하면 false 라서 Who are you? 가 출력됨
        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
