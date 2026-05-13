package exam_array;

public class ArraySample_p1 {
    static void main(String[] args) {
        int[] arr = new int[] {3, 6, 9, 12};
        arr[0] = arr[0] + 2;
        arr[1] = arr[2];
        arr[3] = arr[0] + 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("값" + arr[i]);

        }
    }
}
