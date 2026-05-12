package exam_array_copy;

import java.util.Arrays;

public class ArrayCopyByForExample {
    static void main(String[] args) {
        int[] oldIntArray = { 1,2,3,};  //배열 선언
        int[] newIntArray = new int[5]; //배열 선언

        for (int i = 0; i < oldIntArray.length; i++) {  //for 반복문
            newIntArray[i] = oldIntArray[i];            //??
        }
        System.out.println("[Arrays 클래스를 이용하여 출력]");
        System.out.println(Arrays.toString(newIntArray));   //Arrays 클래스를 문자열로 변환 (??)

        System.out.println("\n[for문을 이용하여 출력]");
        for (int i = 0; i < newIntArray.length; i++) {      //0 시작; i는 newIntArray 길이보다 작으면; i 후위
            if (i < newIntArray.length -1) {                //
                System.out.print(", ");
            }
        }
    }
}
