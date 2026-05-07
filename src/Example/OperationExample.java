package Example;

import java.util.Scanner;

public class OperationExample {
    static void main(String[] args) {

        int num1;
        int num2;
        char sign;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        num1 = input.nextInt();

        System.out.println("두번째 숫자를 입력하세요: ");
        num2 = input.nextInt();

        System.out.println("한문자를 입력하세요: ");
        sign = input.next().charAt(0);

        switch (sign) {
            case '+':
                result = num1 + num2;
                System.out.printf("%d + %d = %d%n", num1, num2, result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("%d - %d = %d%n", num1, num2, result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("%d * %d = %d%n", num1, num2, result);
                break;

            case '/':
                if(num2 !=0) {
                    result = num1 / num2;
                    System.out.printf("%d / %d = %d%n", num1, num2, result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
            default:
                System.out.println("오직 +,-,*,/ 부호중 하나를 입력하세요");



        }


    }
}
