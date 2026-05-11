package exam_array;

public class CharArrayExample {

    /* 대문자와 소문자 전체를 출력하도록 코딩해 주세요. 아스키 코드: A-65, a-97 */

    static void main(String[] args) {
//        char[] chars = new char[52];
//
//        char ch = 'A';
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] = ch++;
//            if (ch == '['){
//                ch = 'a';
//            }
//        }
//        System.out.println("알파벳 출력");
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println();
//            }
//        }
//    }


        // 1. 크기가 26인 char형 배열을 생성합니다. (A~Z까지 26개)
            char[] alphabet = new char[26];

            //배열 채우기
            for (int i = 0; i < alphabet.length; i++){
                alphabet[i] = (char) ('A' + i);
            }
            // 대문자 출력
        System.out.println("대문자 출력 :");
            for (char c : alphabet) {
                System.out.printf("%-2c", c);
            }


        System.out.println();

        //소문자 출력: 표준 API 활용 또는 형변환 일괄성 유지
        System.out.println("소문자 출력 : ");
        for (char c : alphabet) {
            //방법 A: 표준 메서드 사용 (의도가 명확함)
//            System.out.printf("%-2c", Character.toLowerCase(c));
            System.out.printf("%-2c", (char) (c + 32));

            //방법 B: 연산을 통한 출력
            }


    }
}