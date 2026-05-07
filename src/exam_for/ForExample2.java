package exam_for;

// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

import java.util.Scanner;

public class ForExample2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수 반복 값을 입력하세요: ");
        int num = scanner.nextInt();


        int sum =0;
        for (int i = 1; i <= num;  i++) {

            System.out.println((i + 1) + "번째 수를 입력하세요.");
            int su = scanner.nextInt();
            sum += i;
        }
        System.out.println("입력한 모든 숫자의 합: " + sum);
    }
}
