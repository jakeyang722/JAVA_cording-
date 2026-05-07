import java.util.Scanner;

public class IfElseIfElseExample {

    static void main(String[] args) {
        int score;
        char grade;

        Scanner input = new Scanner(System.in);
        System.out.print("점수는 0~100 사이로 입력해 주세요.");
        score = input.nextInt();


        if (score < 0 || score > 100) {  //0 ~ 100 사이가 아닐 경우
            System.out.println("점수는 0~100 사이로 입력해 주세요.");

        } else {   //if으로 else 연결 가능******)
            if (score >= 90)
                grade = 'A';
            else if (score >= 80)  //score는 80 ~ 89. (Score>=80 && Score<=89)
                grade = 'B';
            else if (score >= 70)  //score는 70 ~ 79. (Score>=70 && Score<=79)
                grade = 'C';
            else if (score >= 60)  //score는 60 ~ 69. (Score>=60 && Score<=69)
                grade = 'D';
            else  //score는 59이하
                grade = 'F';

            //System.out.println("점수가 " + score + "입니다.");
            //System.out.println("학접은 " + grade + "입니다.");
            System.out.printf("점수 = %d 학점 = %c", score, grade);  // {} 밖에 있으면 입력이 없음. 안에 있어야.
        }  //if으로 else 연결 가능****** 닫아야함)

        if(score >= 0 && score <= 100) { // 0 ~ 100로 입력하였을 경우
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.printf("점수 = %d 학점 = %c", score, grade);
        } else { // 0 ~ 100 사이가 아닐 경우 아래 문구 출력)
            System.out.println("점수는 0과 100사이로 입력해 주셔야 합니다.");
        }

        input.close();


    }
}
