package Example;

import java.util.Scanner;

public class ArrayExample1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[10];

        System.out.print("여러 수들을 입력해 주세요(공백기준): ");
        String strValue = sc.nextLine();

        String[] strValueArray = strValue.trim().split(" ");

        for (String s : strValueArray) {
            int num = Integer.parseInt(s);

            if (num >= 1&& num <= 10) {
                counts[num - 1]++;
            }
        }
        System.out.println("\n[ 집계 결과 ]");
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d의 개수 : %\n", (i + 1), counts[i]);
        }

        sc.close();
    }

}
