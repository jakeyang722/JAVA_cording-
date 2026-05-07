import java.util.Scanner;

public class CoffeePrice {
    static void main(String[] args) {
        int price = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("[메뉴]카푸치노, 카페라떼, 에스프레소, 아메리카노, 아이스아메리카노");

        System.out.println("무슨 커피 드릴까요? ");
        String order = scanner.next();

//        String menu = order.trim().replace( target " ", replacement"");


        switch (order) {
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "에스프레소":
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
        }

        if (price != 0) {
            System.out.println(order +"는 " + price + "원입니다.");
        }

        scanner.close();
    }
}
