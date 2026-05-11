package exam_array;

public class CardExample {

    /* 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성해보자.
    { "Clubs", "Diamonds", "Hearts", "Spades" }와
    { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" }를
    가지고 있는 문자열 배열을 생성하고 위 내용으로부터 랜덤하게 하나의 카드를 선택하는 코드를 작성하라
    실행 결과 : Hearts의 Jack
     */

    static void main(String[] args) {

        String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        System.out.println("카드를 두장 뽑습니다");

        for (int i = 1; i <= 2; i++) {
            int shapeIndex = (int) (Math.random() * shapes.length);    //(int) -> (강제) 형변환
            int rankIndex = (int) (Math.random() * ranks.length);

            String pickedShape = shapes[shapeIndex];   //shapes 배열의 칸에 들어있는 데이터를 꺼내 씀
            String pickedrank = ranks[rankIndex];      //ranks 배열의 칸에 들어있는 데이터를 꺼내 씀

            //System.out.printf("카드 %d: %s %s\n", i, pickedShape, pickedrank);
        }
    }
}
