package Arrays;

/*Leetcode 48. Rotate Image
*
* Author : @Vaibhav Saxena
* */


public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15,14,12,16}};
        rotate1(matrix);
        rotate2(matrix);

        int n = matrix.length ;
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();

        }
    }

    /*
    *  Inplace rotation  without using extra space
    * */
    private static void rotate2(int[][] matrix) {

        int n = matrix.length ;
        // transpose the image
        for(int i = 0 ; i < n ; i++){
            for(int j = i ;  j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
        for(int i = 0 ; i < n ; i++){
            matrix[i] = reverse(matrix[i]);
        }
    }

    // with extra Space
    public static void rotate1(int[][] matrix) {
        int n = matrix.length ;
        int[][] temp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            temp[i] = matrix[i].clone();
        }

        //Transpose the original array
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                matrix[i][j] = temp[j][i];
            }
        }

        // Swap columns
        for(int i = 0 ; i < n ; i++){
            matrix[i] = reverse(matrix[i]);
        }
    }

    public static int[] reverse(int[] arr){
        int i = 0 ;
        int j = arr.length - 1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++ ; j-- ;
        }
        return arr ;
    }

}
