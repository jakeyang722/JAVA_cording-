package exam_array_in_array;

import java.util.Arrays;
import java.util.Scanner;

/*
사용자로부터 3명 학생의 국어, 영어 수학 성적을 입력받아서
학생별 합계와 평균을 구하는 프로그램을 배열을 이용해서 작성해 주세요.

각각 점수 입력 받아야 -> for문 위에서 받음.

 */
public class StudentArrayExample {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        final int NUM = 3;
        final int SCORE = 3;

        int [][] score = {
                {0, 0, 0, 0}, //국어점수
                {0, 0, 0, 0}, //영어
                {0, 0, 0, 0}  //수학
        };

        for (int i = 0; i < NUM; i++) {
            for (int j = 0; j < SCORE; j++) {
                score[i][SCORE - 1] += score[i][j];
            }
        }

        String[] name = {"국어","영어","수학"};
        String[] subject = {"국어", "영어","수학","합계","평균"};
*/

        /*
        int score;
        for (int i = 0; i < score.length; i++) {
            System.out.println("국어, 영어, 수학 점수를 입력해주세요.");
            score = scanner.nextInt();
        }


        int[][] Score = {
                { }

        };
         */

        final int STUDENTS = 3;
        final int SUBJECTS = 3;

        int[][] scores = new int[STUDENTS][SUBJECTS];
        String[] subjectName = {"국어", "영어", "수학"};
        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("====== 3명의 학생 데이터 입력 ======");
        for (int i = 0; i < STUDENTS; i++) {
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.println((i+1)+"번째 학생의 " + subjectName[j] +"성적을 입력하시오");
                scores[i][j] =sc.nextInt();
            }
        }
        sc.close();

        System.out.println("\n====== 3명의 학생 데이터 출력 ======");
        System.out.println("국어\t\t영어\t\t수학\t\t총점\t\t평균");       //  \t  탭
        System.out.println("----------------------------------");
        for (int i = 0; i < STUDENTS; i++) {
            total = 0;

            for (int j = 0; j < SUBJECTS; j++) {
                total += scores[i][j];
                System.out.printf("%3d\t", scores[i][j]);
            }
            System.out.printf("%3d\t%.1f\n", total, (double)total/SUBJECTS);
        }


























    }
}
