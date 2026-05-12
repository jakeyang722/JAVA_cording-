package Example;
/*극장 예약 시스템
    좌석 10개
    사용자 예약시 좌석 배치표
    예약 끝난 좌석은 1로 표시
         비어있는 좌석은 0으로 표시
         //Arrays.sort(sits);
         [실행결과]
         ------------------------
         1 2 3 4 5 6 7 8 9 10
         ---------------------
         0 0 0 0 0 0 0 0 0 0            1차원
         원하시는 좌석번호를 입력하세요(종료는-1):2

 */
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;
import java.util.Scanner;

public class TheaterReserve {


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] seats = new int[10];

//        System.out.print("---------------------");
//        for(int i = 0; i < seats.length; i++) {
//            System.out.println(" ");
//        }

//        System.out.println("---------------------");
//        for (int reservation : seats) {
//            System.out.print(seats + " ");
//        }

//        System.out.println("---------------------");


//        if (seats[i] < 1 || seats[i] > 10) {
//            System.out.println("올바른 숫자를 입력하세요.");
//        }

        while (true) {
            System.out.println("-----------------");
            for (int i = 1; i <= seats.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n-----------------");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(seats[i] + " ");
            }
            System.out.println("\n-----------------");
            System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1): ");
            int seatNumber = scanner.nextInt();
            if (seatNumber == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;  // while 반복문 탈출
            } else if (seatNumber < 1 || seatNumber > seats.length) {
                System.out.println("좌석 번호 선택이 잘못되었습니다.");
            } else if (seats[seatNumber - 1] == 1) {
                System.out.println("이미 예약된 자리.");
            } else {
                seats[seatNumber - 1] = 1;
                System.out.println("예약되었습니다.");
            }
        }
        scanner.close();
    }
}