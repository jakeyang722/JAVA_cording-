package exam_array;

import java.util.Scanner;

public class ArrayExample4 {
    static void main(String[] args) {

        /* 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
            중간 이후부터는 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
            단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력하고 다시 정수를 받고록 하세요
         */

        Scanner sc = new Scanner(System.in);

//        int[] odd;

//        for (int i = 0; i < odd.length; i++) {


/*
            System.out.println("3이상 홀수자리 숫자를 입력해주세요.");
            sc.nextInt();

            if (!(odd[i] % 2 = 0)) {
                System.out.println("홀수가 아닙니다 다시 입력하세요.");

            } else () {
*/
        int number;

        while (true) {
            System.out.print("정수: ");
            number = sc.nextInt();

            if (number < 3 || number % 2== 0) {
                System.out.println("다시 입력하세요.");
            } else {
                break;
            }
        }

        int[] array = new int[number];
        int middle = number / 2;

        for (int i = 0; i <= middle; i++) {
            array[i] = i + 1;
        }

        for (int i = middle + 1; i < number; i++) {
            array[i] = array[number - i -1];
        }

        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            if (i < array.length -1) {
                    System.out.print(",");
            }
        }
        sc.close();
    }
}