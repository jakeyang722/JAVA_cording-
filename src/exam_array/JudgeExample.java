package exam_array;

//올림픽과 같은 국제 대회에서 심사위원들이 선수들에게 점수를 주고 평균을 구하는 과정을 살펴보면
// 전체 심사위원들의 점수를 모두 합하는 것이 아니라, 최대점수와 최소점수를 제거한 나머지 점수의
// 평균으로 최종점수를 확정하는 경우가 많다.
// 아래와 같이 심사위원 5명의 점수를 입력받아 최대와 최소 점수를 제거한 점수들의 평균을 구하는 프로그램을 작성하시오

//1. 점수 입력
//2. 5명의 심사위원
//3. *빼먹음* 점수 0~100점 사이 받아야 -> 범위 조건
//?. 최대,최소점수 제거  -> 어떤 조건으로?
//?. 나머지 점수로 평균

import java.util.Arrays;
import java.util.Scanner;

public class JudgeExample {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("심사위원 5명의 점수를 전부 입력하세요.");
            scores[i] = scanner.nextInt();

            if (scores[i] < 0 || scores[i] > 100) {
                System.out.println("0~100점 사이 숫자를 입력해주세요.");
                scores[i] = scanner.nextInt();
                break;
            }
        }

        Arrays.sort(scores);

        for (int i = 1; i < scores.length - 1; i++) {           //저장공간 60 80 20 30 50 >  30 50 60
            System.out.println(scores[i]);
        }





            //maximumValue = Math.max(num1, Math.max(num2, num3);
        //System.out.println("최대값은 : " + maximumValue);

    }
}
