package chd.study.mvnbook;

/**
 * @author 30568
 */
public class Array {
    /**
     * 定义数组 静态初始化
     */

    public static void main(String[] args) {

        //动态初始化
        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("====================");

        //静态初始化
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        for (int j : arr2) {
            System.out.print(j + " ");
        }

        //二维数组
        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //动态初始化二维数组
        int[][] arr4 = new int[3][2];
        //静态初始化二维数组
    }
}
