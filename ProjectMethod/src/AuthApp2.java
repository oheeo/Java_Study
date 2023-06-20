public class AuthApp2 {

    public static void main(String[] args) {
        // 제어문 응용

        // String[] users = {"hee", "nana", "ken"};
        String[][] users = {   // 비번까지 포함한 2차원 배열
                {"hee", "1111"},
                {"nana", "2222"},
                {"ken", "3333"}
        };
        String inputId = args[0];  // user 에 있는 목록에 inputId 로 들어온 값이 있는지?
        String inputPass = args[1];

        boolean isLogined = false;  // 로그인이 안 된 상태

        for (int i = 0; i < users.length; i++) {
            String[] current = users[i]; // 현재 user
            if(
                    current[0].equals(inputId) && current[1].equals(inputPass)
            ) {
                isLogined = true;
                break;  // 사용자가 true 면 반복문을 계속 할 필요가 없음
            }
        }
        System.out.println("Hi");
        if(isLogined) {  // isLogined 가 참일때
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
