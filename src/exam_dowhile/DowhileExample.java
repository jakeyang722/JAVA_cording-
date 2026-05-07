package exam_dowhile;

import java.util.Scanner;

public class DowhileExample {
    static void main(String[] args) {
        // 예제1----------- 선처리 후조건문임을 확인
        int num = 0;
        do {
            System.out.println("num의 값: " + num);
            num++;
        } while (num < 0);
        System.out.println();

        //예제2----------- 1에서부터 10까지 출력
        int i = 1;
        do {
            System.out.println(i +" ");
            i++;            //i를 하나 후위로 더 해줌
        } while (i <= 10);   //i가 10보다 크거나 같을시     1+1 do를 다시 실행함.

        //예제3----------- 10에서부터 1까지 출력
        i = 10;
        do{
            System.out.print(i +" ");
            i--;
        } while (i > 0);            //i가 0보다 작으면????

        System.out.println();

        //예제4----------- 1에서 100까지의 합을 출력해 주세요 (do ~ while문을 사용)

        int number = 1, sum = 0;
        do{
            sum+=number++;
        } while (number <= 100);            //number가 100이랑 같거나 크면

        System.out.print("1에서 100까지의 합 = " + sum);
        System.out.println();


        //예제5----------- 사용자에게 문자 및 숫자를 입력 받아서 출력하고자 함.
        //이때 종료는  q를 입력하면 된다.

        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.println("\n메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 \"종료\"를 입력하세요.");

        do {
            System.out.print(">");
            inputString = scanner.nextLine();    //*중요* String은 기초형이 아님 연산자가 아닌 메서드로 비교를 해야.
            System.out.println(inputString);
        }while(!scanner.equals("종료"));          //*중요*

        System.out.println();
        System.out.println("프로그램 종료합니다.");
        System.out.println();

        }
    }

