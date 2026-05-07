import java.util.Scanner;

public class IfTest {
    static void main(String[] args) {
// 무조건 작은 값부터 나와야.

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int temp;

        System.out.println("첫번째 숫자를 입력해주세요.");
        num1 = input.nextInt();

        System.out.println("두번째 숫자를 입력해주세요.");
        num2 = input.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " "+num2);
        input.close();

    }
}
