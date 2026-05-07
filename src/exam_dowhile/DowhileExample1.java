package exam_dowhile;

public class DowhileExample1 {
    //do-while문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하시오
    static void main(String[] args) {
        char ch = 'a';                      //'a'소문자 a는 아스키코드:97 'A'는 65
        do {
            System.out.println(ch);
            //마지막 문자 뒤에는 공백 붙이지 않음
            if (ch < 'z') {                 //마지막 원소는 제어하기 위해서 if를 가지고 활용
                System.out.println(" ");
            }
            ch++;
        } while (ch <= 'z');
    }
}
