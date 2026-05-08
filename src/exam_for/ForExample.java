package exam_for;

public class ForExample {


    static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {   // 0.i = 3 , 1. 범위:i <= 10, 2. (i % 3 == 0) 3. i++
            if (i % 3 == 0) {
                sum += i; // 3 + 6 + 9
            }
        }
        System.out.println("3의 배수를 1~10까지 더한 값: " + sum);
        System.out.println("3의 배수를 1~10까지 더한 값: " + sum);
        System.out.println("3의 배수를 1~10까지 더한 값: " + sum);
        System.out.println("3의 배수를 1~10까지 더한 값: " + sum);

//        System.out.println("3의 배수를 1~10까지 더한 값: " + sum);


    }
}
