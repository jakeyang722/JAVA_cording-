import java.util.Scanner;

public class SwitchCaseExample {
    static void main(String[] args) {

        String role;

        Scanner input = new Scanner(System.in);

        System.out.println("사용자 권한을 입력해주세요.");
        role = input.nextLine();

        switch (role){
            case "관리자":
            System.out.println("회원관리, 게시글 관리");


            case "회원":
            System.out.println("게시글 작성, 댓글 작성");


            case "비회원":
            System.out.println("게시글 조회 가능합니다");
            break;

            default:
                System.out.println("잘못 입력하셨습니다.");

        }

    }

}
