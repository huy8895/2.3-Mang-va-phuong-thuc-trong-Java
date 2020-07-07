package Tim_phan_tu_lon_nhat_trong_mang_hai_chieu;

public class findTheGreatest {
    public static void main(String[] args) {
        int[][]arr = createTwoDimensionalArray(2,3);
        showArray(arr);
        int []indexMax = getIndexMaxElement(arr);
        int rowMax = indexMax[0] ;
        int colMax = indexMax[1] ;
        System.out.println("max of Array is: " + arr[rowMax][colMax] + " At " +
                " row " + (rowMax + 1) + " col " + (colMax + 1));

    }
    public static int[][] createTwoDimensionalArray(int rows,int cols){
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j ++){
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
    public static void showArray (int[][]array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    public static int [] getIndexMaxElement(int[][] array){
        int max = array[0][0];
        int[] indexMax = new int[2];
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                    indexMax[0] = i;
                    indexMax[1] = j;
                }
            }
        }
        return indexMax;
    }
}
