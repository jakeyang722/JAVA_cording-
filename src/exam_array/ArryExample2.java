package exam_array;

import java.util.Scanner;

public class ArryExample2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        //예제1) 사용자로 하여금 5개의 정수를 입력받아 그 값을 출력하시오. (단 배열을 이용하여.)
//        //배열 선언         //배열 생성
        int[] nums = new int[5];

        System.out.println("===배경의 값 입력 ===");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 정수 입력: ");             //(i+1)?
            nums[i] = sc.nextInt();                                 //nums[i]?
        }
//
        System.out.println("===배열의 값 출력===");
        for (int j = 0; j < 5; j++) {
            System.out.println("nums[" + j + "] = " + nums[j]);
        }
        System.out.println();
//
//        //문자열 배열
        String[] language = {"Java", "C", "C++"};
        for (int i = 0; i < language.length; i++) {
            System.out.println(language[i]);
        }
        System.out.println();
//
//        /*예제2) 5명의 국어점수는 80,95,90,85,100으로 배열에 초기화
//        영어점수는 입력 받아 배열에 저장하여 출력하는 프로그램 작성
//         */

        int[] kor = {80, 95, 90, 85, 100};
        int[] eng = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("영어 점수를 입력하세요.");
            eng[i] = sc.nextInt();
        }
        sc.nextLine();                                   // **줄바꿈을 해줌 (위에 수행후, 밑에 있는 점수 바로 출력됨)**
//
        for (int i = 0; i < 5; i++) {
            System.out.printf("국어 :%3d ", kor[i]);
            System.out.printf("영어 :%3d\n", eng[i]);
        }
        System.out.println();

        /* 예제3) 길이가 10인 배열을 선언하고. 1부터 10까지의 값을 반복문을 이용.하여       //어려움
                 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
         */

        int[] array1 = new int[10]; //0000000 들어감

        for (int i = 0; i < array1.length; i++) {   //대입 // 10보다 작을 동안
            array1[i] = i + 1;                           //?\ 그냥 실행시 0,1,2,3,4,5,6,7,8,9.   +1 넣으면 1부터 하나씩 추가되어 10이 됨.
        }

        for (int i = 0; i < array1.length; i++) {  //출력
            System.out.print(array1[i] + " ");
        }
        System.out.println();


        /*예제5) 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어
                개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

         [출력 예제]
         문자열 :application
         문자: i
         application에 i가 존재하는 위치(인덱스) : 4 8
         i개수 : 2
         */

        char[] charArray = null;                //문자형 배열 선언
        int count = 0;

        System.out.print("문자열 : ");
        String str = sc.nextLine();             //문자열 받는얘

        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);      //문자 받는 (0) 첫번째껏.

        charArray = new char[str.length()];     //문자열 크기를 알수 없기 때문에, (str 문자) str.length 문자가 가지고 있는 길이수를 가져온다

        for (int i = 0; i < charArray.length; i++) {   // 순서: 1 - int i = 0, 2 - i < charArray.length, 3 - {실행문}, 4 - i++
            charArray[i] = str.charAt(i);
        }       //전용 메서드가 있음  매서드로 문자형 배열 열기
        //charArray = str.tocharArray(); 'to:변환' -> '문자배열로 변환하겠다'    to:변환 str:문자 char:? Array:배열

        System.out.printf("%s에 %c가 존재하는 위치(인덱스): ", str, ch);
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ch) {
                System.out.print(i + " ");
                count++;                                                //1증가 카운트 갯수 셈
            }
        }
        System.out.printf("\n%c 개수: %d", ch, count);
        sc.close();
    }

}
