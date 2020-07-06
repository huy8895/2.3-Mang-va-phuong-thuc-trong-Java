package Xoa_phan_tu_khoi_mang;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 34, 5};
        int index_del = findX(4,arr);
        removeX(index_del, arr);
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }

    public static int findX(int number, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return index = i;
            }
        }
        return index;
    }

    public static int[] removeX(int indexX, int[] array) {
        for (int i = indexX; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
