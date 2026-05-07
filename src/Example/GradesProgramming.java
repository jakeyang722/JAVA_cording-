package Example;

import java.util.AbstractMap;
import java.util.Scanner;

public class GradesProgramming {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score1;  //중간
        int score2;  //기말
        int score3;  //레포트
        int score4;  //출석점수

//        String printdata = "중간고사, 기말고사, 레포트, 출석 점수를 기입하세요";
//        System.out.println(printdata);

        System.out.println("중간고사 점수를 입력하세요.");
        score1 = input.nextInt();
        System.out.println("기말고사 점수를 입력하세요.");
        score2 = input.nextInt();
        System.out.println("레포트 점수를 입력하세요.");
        score3 = input.nextInt();
        System.out.println("출석점수를 입력하세요.");
        score4 = input.nextInt();

        int value1;

        value1 = (score1 + score2) / 2;

        double totalValue = (value1 * 0.6) + (score3 * 0.2) + (score4 * 0.2);


        char grade;

        if(totalValue >= 90) {
            grade = 'A';
        } else if (totalValue >=80) {
            grade = 'B';
        } else if (totalValue >=70) {
            grade = 'C';
        } else if (totalValue >=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        String value;

        switch (grade) {
            case 'A':
            case 'B':
                value = "execellent";

                break;

            case 'C':
            case 'D':
                value = "good";

                break;

            default:
                value = "poor";
        }







        System.out.println("------결과입니다------");

        String printdata = "중간고사: " + score1 + "\n기말고사: " + score2 + "\n레포트: " + score3+ "\n출석점수: " + score4;
        System.out.println(printdata);

        System.out.println(" ");

        System.out.printf("성적: %.2f\n",  totalValue);
        System.out.println("학점: "+ grade);
        System.out.println("평가: "+ value);
    }
}
