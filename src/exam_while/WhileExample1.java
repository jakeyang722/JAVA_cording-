package exam_while;

public class WhileExample1 {
    static void main(String[] args) {
/*        int num = 1, sum = 0;
        while (num = 100) {
            sum = sum + num;
            num % 2 == 0;  //2를 나누었을때 나누어 떨어진다 0의미
            */

        int i = 1;
        int evenhap = 0;
        int oddhap = 0;
        while (i <= 100){
            if ((i % 2 == 0)) {
                evenhap += i;
            } else {
                oddhap += i;
            }
            i++;
        }
        System.out.println("짝수의 합 : " + evenhap);
        System.out.println("홀수의 합 : " + oddhap);

    }
}
