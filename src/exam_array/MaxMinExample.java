package exam_array;

public class MaxMinExample {

    /*
    다음의 정수 중에 12, 26, 68, 98,76,54,8,6,4
    가장 큰값(최대값), 가장 작은 값(최소값)을 출력해 주세요.

    [출력 결과]
    최대값:00, 최소값:00
     */

    static void main(String[] args) {

        int[] su = { 12, 26, 68, 98, 76, 54, 8, 6, 4 };     //수를 입력
        int max = su[0];                                    //max, min 값을 받을 0 초기화
        int min = su[0];

        for (int i = 1; i < su.length; i++) {               //for 반복문을 써야하는 이유?
                                                            // 선언된 su를 길이만큼
            if (su[i] > max)
                max = su[i];
            if (su[i] < min)
                min = su[i];
        }
        System.out.printf("최대값 :%d, 최소값 :%d%n", max, min);
    }
}
