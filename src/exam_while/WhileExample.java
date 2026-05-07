package exam_while;

public class WhileExample {
    static void main(String[] args) {
//1부터 100까지의 합 출력하기 (1에서 5까지의 합 출력)
        int num = 1, sum = 0;
        while (num <= 5) {
//            sum = sum + num;
//            num = num + 1;
            sum += num++;
        }
        System.out.println("1부터 5까지의 합 = " + sum);
// ----------------------------------------------------
//5부터 1까지 출력하기
        System.out.println("\n5에서부터 1까지 출력");
        int i = 5;
        System.out.println("1. 정수: ");
        while ( i > 0){
            System.out.print(i + " "); // 5 4 3 2 1
            i--;
        }
        System.out.println();
//----------------------------------------------------
//5부터 1까지 출력하기
        i = 5;
        System.out.println("2. 정수: ");
        while (true) {
            System.out.print(i + " ");
            i--;
            if (i < 1){
                break;
            }
        }
        System.out.println();
//----------------------------------------------------
// 1부터 5까지 출력하기
        System.out.println("1에서부터 5까지 출력 ");
        i = 1;
//1)시작 포인트
        System.out.println("1. 정수: ");
//2) (범위 지정) {실행, 내용}
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
//----------------------------------------------------
/*        System.out.println("출력해주세요");
        i = 10;*/

    }
}
