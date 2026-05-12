package Example;
/*
90 75 61 226 75.33 C pass 2
55 56 46 157 52.33 F nopass 3
90 90 90 270 90.00 A pass 1

// 3. 배열의 길이(scores.length)로 나누어 평균 계산
double avg = (double) sum / scores.length;

학생명 name 점수score 평균 avg 학점 grade 재수강 pass 순위 rank
 */
public class GradesProgramming2 {
    static void main(String[] args) {
        String[] students = {"홍길동", "김철수", "이진희"};

        int[][] score = {
                {90, 75, 61, 0},
                {55, 56, 46, 0},
                {90, 90, 90, 0},
        };


        /*
        double avg;    //기초형으로 쓰냐.... 1차원으로 -> double[] avg = new double[3]
        char grade;

        int avg2 = 0;
        int count = 0;

         */

        double[] avg = new double[3];
        char[] grade = new char[3];
        String[] pass = new String[3];              //재수강 여부
        int[] rank = new int[3];

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                score[i][score.length] += score[i][j];
            }

            avg[i] = (double) score[i][3] / 3;          //평균 구하기

            grade[i] = switch ((int) avg[i] / 10) {          //학점 구하기
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };

            if (avg[i] >= 60) {
                pass[i] = "pass";               //바로 써도됨?
            } else {
            }

            String[] numLabel = {"1", "2", "3"};
            String[] subject = {"번호", "이름", "국어", "영어", "수학", "총점", "평균", "학점", "재수강", "순위"};

            System.out.println("          성적 프로그램");
            System.out.println("========================================");

            for (String s : subject) {
                System.out.print(s + "\t");
            }

            System.out.println();

            System.out.println("========================================");

            for (int k = 0; k < students.length; k++) { //3번이 적으면   %-2d %-5s ->-5는 뒤에 칸을 넣는.
                System.out.print(numLabel[k] + " " + students[k] + "\n"); // 행시작 번호

                for (int l = 0; l < score.length; l++) {
                    for (int m = 0; m < score[l].length; m++) {
//                    score += score[l][m];
//                    count++;
                    }
                }
            }
//            for (int i = 0; i < score.length; i++) {
//                for (int j = 0; j < score[i].length; j++) {
//                    System.out.print(score[i][j] + " ");
//                }
//            }
            System.out.println();
        }
    }
}
