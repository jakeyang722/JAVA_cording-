package exam_array_in_array;

public class ArrayInArrayExample {
    static void main(String[] args) {
        int [][] arr1 = new int[2][3];

        System.out.println("arr1.length = " + arr1.length);
        System.out.println("arr1[0].length = " + arr1[0].length);
        System.out.println("arr1[1].length = " + arr1[1].length);
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[i].length; k++) {
                System.out.print("arr1[" + i + "][" + k + "]=" + arr1[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int arr2[][] = new int[][] {{10,20,30}, {40,50,60}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.printf("%-5d,", arr2[1][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = new  int[2][];
        arr3[0] = new int[] {1 , 5};
        arr3[1] =new int[3];
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3[i].length;k++) {
                System.out.print("arr3[" + i + "][" + k + "]=" + arr3[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
