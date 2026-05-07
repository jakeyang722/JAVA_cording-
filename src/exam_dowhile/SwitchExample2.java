package exam_dowhile;

import java.util.Scanner;

public class SwitchExample2 {
    static void main(String[] args) {
        int score;
        char grade;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("점수는 0~100 사이로 입력해 주세요.");
            score = input.nextInt();
        } while(score < 0 || score > 100);


        System.out.printf("점수 = %d ", score);

        switch (score / 10) {
            case 10:
            case 9:  //90~99?
                grade = 'A';
                break;

            case 8: //80
                grade = 'B';
                break;

            case 7: //70~79
                grade = 'C';
                break;

            case 6: //60~69
                grade = 'D';
                break;

            default:
                grade = 'F';

/*
            char grade = switch (score / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
*/

                System.out.printf("학점 = %c", grade);

                input.close();

                }
        }
    }
