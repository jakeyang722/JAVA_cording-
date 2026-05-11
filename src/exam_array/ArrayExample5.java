package exam_array;

import java.util.Scanner;

public class ArrayExample5 {
    /* 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
       단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
       [실행 예시]
       주민등록번호(-포함) : 123456-1234567
       123456-1******
     */

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주민등록번호(-포함) : ");
        String pId = scanner.nextLine();

        char[] origin = new char[pId.length()];
        for (int i = 0; i < origin.length; i++) {
            origin[i] = pId.charAt(i);
        }
        char[] copy = new char[origin.length];

        for (int i = 0; i < copy.length; i++) {
            if (i <= 7) {
                copy[i] = origin[i];
            } else {
                copy[i] = '*';
            }
            System.out.print(copy[i]);
        }

//        System.out.println(" ");
//
//    char[] origin = pId.toCharArray();
//
//    //System.arraycopy를 이용한 효율적인 배열 복사
//    char[] copy = new char[origin.length];
//        System.arraycopy(origin, 0 , copy, 0, origin.length);
//         //0번째부터 시작 -> (복사해서 담을 배열) 복사 0번째로, 번호 전체를
//
//        //성별 자리 이후 마스킹 (8번 인덱스 부터)
//
//        for (int i = 8; i < copy.length; i++) {
//            copy[i] = '*';
//        }
//
//        for (char c : copy) {
//            System.out.println(c);
//        }

    scanner.close();
    }
}



