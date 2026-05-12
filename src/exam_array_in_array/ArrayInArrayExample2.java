package exam_array_in_array;
/*
1차원 배열에서 12명의 학생들을 출석부 순으로 초기화 하고 - []
3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠        -  [][]
1분단부터 왼쪽부터 오른쪽순으로 차례대로 자리를 배치하세요.

<출석부>
1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
7. 송성실 8. 윤예의 9. 진재주 10. 김철수 11. 홍길동 12. 배혜진

[실행예시]
== 1분단 ==
강건강  남나나
도대담  류라라
문미미  박보배
== 2분단 ==
송성실  윤예의
진재주  김철수
홍길동  배혜진
 */
public class ArrayInArrayExample2 {
    static void main(String[] args) {

        // 1. 데이터 준비: 전체 학생 명단 (12명)
        int count = 0;  // 학생 명단(students)의 인덱스를 추적할 변수
        String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
        "송성실", "윤예의","진재주", "김철수", "홍길동", "배혜진"};

        // 2. 좌석 구조 생성: 3행 2열(총 6칸)의 2차원 배열 2개 생성
        String[][] seat1 = new String[3][2];  // (A) 바깥쪽 for문 (행)
        String[][] seat2 = new String[3][2];  // (B) 안쪽 for문 (열)

        // 3. 데이터 배정 (1분단 채우기)
        // seat1.length는 행의 개수(3), seat1[S].length는 각 행의 열 개수(2)
        for (int S = 0; S < seat1.length; S++) {         // (줄 선택) (A) 바깥쪽 for문 (행)
            for (int i = 0; i < seat1[S].length; i++) {  // (칸 선택) (B) 안쪽 for문 (열)   안쪽부터 바깥쪽순으로 처리
                seat1[S][i] = students[count++];         // (칸 실행!)
            }
        }

        // 4. 1분단 출력
        System.out.println("== 1분단 ==");
        for (int i = 0; i < seat1.length; i++) {
            for (int j = 0; j < seat1[i].length; j++) {
                System.out.print(seat1[i][j] + " ");  //2차원 배열(좌표)에서 특정한 위치(seat1)에 있는 학생의 이름을 가리킴
            }                                         //seat1[0][0] 강건강
                                                      //seat1[0][1] 남나나
            System.out.println();
        }
        System.out.println();

        // 5. 2분단 출력 (현재 로직상 seat1의 내용을 똑같이 한 번 더 출력함)
        System.out.println("== 2분단 ==");
        for (int i = 0; i < seat1.length; i++) {
            for (int j = 0; j < seat1[i].length; j++) {
                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
