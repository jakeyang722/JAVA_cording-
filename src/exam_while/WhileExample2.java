package exam_while;

import java.util.Scanner;

public class WhileExample2 {
    static void main(String[] args) {
        int sum = 0, count = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요. [종료는 -1을 입력]");

        //입력과 동시에 조건을 검사하여 중복 코드를 제거
        while ((n = scanner.nextInt()) != -1) {    //-1과 같이 않는 동안 != -1;
            sum += n;
            count++;
            System.out.println("합: ");
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.println("입력된 " + count + "개 정수의 합계: " + sum);
            }
        }
    }