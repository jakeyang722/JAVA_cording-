package exam_while;

import java.util.Scanner;

public class GugudanExample {
    static void main(String[] args) {

        int dan;
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("구구단 중에서 출력하고 싶은 단 (2~9)을 입력하시오: ");
        dan = input.nextInt();

        while (dan < 2 || dan > 9) {   //단은 2보다 작으면 안되고 || 9보다 크면 안된다.
            System.out.print("구구단 중에서 출력하고 싶은 단(2~9)을 입력하시오: ");
            dan = input.nextInt();
        }

        while (i <= 9) {
//            System.out.println(dan + "*" + i + "=" + (dan * i));
            System.out.printf("%d*%d=%d\n", dan, i, (dan * i));
            i++;
        }
        input.close();
    }
}

