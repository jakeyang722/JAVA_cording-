package exam_array_in_array;

public class Rainfall {
    static void main(String[] args) {
        // 1. 상수 정의 (가독성과 유지보수를 위해 사용)
        final int YEARS = 3;
        final int QUARTERS = 5; // 1~4분기 + 합계칸(1칸) = 총 5칸

        // 2. 2차원 배열 초기화 (마지막 열은 합계를 위해 0.0으로 비워둠)
        double[][] rain = {
                {368.1, 586.5, 351.2, 66.5, 0.0},  // 2018년
                {173.9, 493.0, 448.4, 168.1, 0.0}, // 2019년
                {172.8, 1012.4, 259.4, 46.7, 0.0}  // 2020년
        };

        // 3. 연도별 합계 계산 로직
        for (int y = 0; y < YEARS; y++) {
            for (int q = 0; q < QUARTERS - 1; q++) {
                // 마지막 칸(index 4)에 각 분기(0~3)의 값을 누적해서 더함
                rain[y][QUARTERS - 1] += rain[y][q];
            }
        }

        // 4. 출력용 헤더 준비
        String[] yearsLabel = {"2018", "2019", "2020"};
        String[] subject = {"년도", "1분기", "2분기", "3분기", "4분기", "총합"};

        // 5. 제목(헤더) 출력
        for (String sub : subject) {
            System.out.print(sub + "\t");
        }
        System.out.println("\n----------------------------------------------------------");

        // 6. 데이터 내용 출력
        for (int y = 0; y < YEARS; y++) {
            // 행의 시작에 연도 레이블 출력
            System.out.print(yearsLabel[y] + "년도\t");

            for (int q = 0; q < QUARTERS; q++) {
                // 소수점 첫째자리까지 출력하고 탭으로 간격 맞춤
                System.out.printf("%.1f\t", rain[y][q]);
            }
            System.out.println(); // 한 연도가 끝나면 줄바꿈
        }
    }
}