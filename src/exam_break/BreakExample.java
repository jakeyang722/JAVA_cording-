package exam_break;

import java.util.Scanner;

public class BreakExample {
    static void main(String[] args) {

        //사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오.
        // 단 종료는 0 ~ 100 사이가 아닌 값 입력

        Scanner scanner = new Scanner(System.in);

        int sum = 0;            //점수들을 더해서 저장할 총점
        int count = 0;          //점수를 몇 번 입력했는지 세어줄 개수

        while (true) {    //(조건식)

            System.out.println("점수를 입력해주세요.(범위 0~100)");
            int score = scanner.nextInt();              //점수 score 저장

            if (score < 0 || score > 100) {             //(조건식)
                System.out.println("범위를 벗어난 점수입니다.");
                break;
            }
            System.out.println("입력완료");

            sum += score;                            //총점에 입력받은 점수를 더함
            count++;                                 //입력횟수 1증가

            System.out.println("총점: " + sum + "점");

            //평균
            if (count > 0) {           //(조건식)     //카운트된게 0보다 크면,
                double avg = (double) sum / count;  //평균 구함
                System.out.println("평균: " + avg + "점");




            }
        }
    }
}
