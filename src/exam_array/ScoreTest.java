package exam_array;

import java.util.Scanner;

public class ScoreTest {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// 학생 수를 입력 받고, 그 수(학생수) 만큼 점수를 입력받아
        // 학생들의 반 평균을 구하도록 프로그램을 작성하여 보자
        int studentCount;
        int total = 0;

        System.out.print("학생 수를 입력하세요: ");
        studentCount = scan.nextInt();

        if (studentCount <= 0){
            System.out.println("학생 수는 1명 이상이어야 합니다.");
            scan.close();
            return;
        }

        int [] scores = new int[studentCount];

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번째 학생의 점수를 입력하세요: ");
            scores[i] = scan.nextInt();

            total += scores[i];
        }

        double average = (double) total / scores.length;
        System.out.printf("평균 성적은 %.2f점입니다.\n", average);   //printf -> %(값).2(소수점2째자리까지 표시 f 들어갈것)
        scan.close();
    }
}
