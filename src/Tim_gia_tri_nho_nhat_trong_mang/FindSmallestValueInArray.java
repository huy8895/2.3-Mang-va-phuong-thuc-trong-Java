package Tim_gia_tri_nho_nhat_trong_mang;


public class FindSmallestValueInArray {
    public static void main(String[] args) {
        int [] arr = {4,12,4,5,12,4,5,1,6};
        int index = minValue(arr);
        System.out.println("Smallest value in Array is: " + arr[index] + " At position " + (index + 1));
    }
    public static int minValue(int[]array){
        int min = array[0];
        int indexMin = 0;
        for (int i = 0;i < array.length;i++) {
            if (min > array[i]) {
                indexMin = i;
            }
        }
        return indexMin;
    }
}
