package exam_dowhile;

public class RandomExample {
    static void main(String[] args) {
        System.out.println(Math.random());

        //난수: Math.random() 메서드를 사용 ->  0.0이상 1.0미만의 double형 실수값을 얻음 (이또한 정해진 알고리즘이 있음)
        // 원하는 범위의 정수 만들기 - (int) (Math.random() * 개수) + 시작값
        //    -> (int) (Math.random() * 10) + 1)

        System.out.println((int) (Math.random() * 10));  // 0~9사이 정수값 출력
        System.out.println((int) (Math.random() * 10) + 1); //1~10사이의 정수값 출력

        int num = (int)(Math.random() * 6) + 1;
        System.out.println("주사위 : " + num);
    }
}
