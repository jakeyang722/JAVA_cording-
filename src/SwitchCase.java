import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("각 층 정보를 제공하고 합니다. \n 1~5 층 수를 입력해 주세요.");

        switch(input.next()){
            case "1":
                System.out.println("1층은 약국입니다");
                break;
            case "2":
                System.out.println("2층은 정형외과입니다");
                break;
            case "3":
                System.out.println("3층은 피부과입니다");
                break;
            case "4":
                System.out.println("4층은 치과입니다");
                break;
            case "5":
                System.out.println("5층은 헬스클럽입니다.");
                break;
            default:
                System.out.println("잘못 입력하였습니다 \n숫자만 입력해주세요.");

                input.close();

        }






//        String Floor;
//        String message = switch (floor1)


    }
}
