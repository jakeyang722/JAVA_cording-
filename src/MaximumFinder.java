import java.util.Scanner;

public class MaximumFinder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("숫자를 입력해주세요.");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        input.close(); //꼭 마지막에 닫을 필요 없음.


        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("최대값" + num1);// 10 3
            }
        }

        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("최대값" + num2);
            }
        }

        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("최대값" + num3);
            }
        }
    }
}
/*

        int num1, num2, num3, maximumValue;

                if (num1 > num2) { // 10 5
                    maximumValue = num1; // 10
                } else {
                    maximumValue = num2;
                }

                if (num3 > maximumValue) {
                    maximumValue =
                }; // 15

            }
        }

        //방법3
maximumValue = Math.max(num1, Math.max(num2, num3);
System.out.println("최대값은 : " + maximumValue);/*

 */