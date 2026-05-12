package exam_array_copy;

public class ArrayCopyExample {
    static void main(String[] args) {
        // 1. 원본 배열 (데이터 3개)
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];
        // 2. 새 배열 (데이터 5개를 담을 수 있는 더 큰 공간)
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // 3. 배열 복사 실행
        // System.arraycopy(원본배열, 원본시작위치, 새배열, 새배열시작위치, 복사할개수);

        // 4. 복사된 결과 출력

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i]);
            // 현재 인덱스(i)의 값을 출력

            // 마지막 요소가 아니라면 콤마(",")를 붙여서 구분함 (마지막은 , 붙이지 않음)
            if(i < newStrArray.length-1);
            System.out.println(", ");

        }
        System.out.println("\n");
    }
}
