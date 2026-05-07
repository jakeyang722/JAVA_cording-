package exam_dowhile;

import java.util.Scanner;

public class NumberGame {

    static void main(String[] args) {
//        int num;
        // 1부터 1사이 정수를 저장 -> 사용자는 질문을 통하여 정수를 맞추는 게임
        //사용자가 답 제시 하면 저장한 정수와 비교하여 제시된 정수가 더 높은지 낮은지 판단함.

        //1부터 10까지 난수를 생성하여 정답으로 저장.
        int answer = (int)(Math.random() *10) + 1;
        int guess;
        int tries = 0;
        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("1~10의 숫자를 입력해주세요.");
//            num = scanner.nextInt();
//
//        } while (num < 0 || num > 10) ;
//
//        System.out.println(" ");
//
//
        do {
            System.out.println("정답을 추측하여 보시오:");
            guess = scanner.nextInt();
            tries++;                                   //몇번째 시도인지 확인.

            //입력한 값이 정답하보다 크면 높은 숫자라고 출력

            if(guess > answer) {
                System.out.println("제시한 정수가 높습니다.");
            }
            //입력한 값이 정답보다 작으면 낮으 숫자라고 출력
            else if (guess < answer) {
                System.out.println("제시한 정수가 낮습니다.");
            }

        }while (guess != answer);

        System.out.printf("축하합니다. 시도횟수 = %d\n", tries);             //정답을 몇번 만에 맞췄는지 출력.
        scanner.close();
    }
}
