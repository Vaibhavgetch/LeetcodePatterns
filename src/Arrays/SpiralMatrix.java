package Arrays;

import java.util.ArrayList;
import java.util.List;


/*
*  Leetcode 54 : Spiral Matrix
*  https://leetcode.com/problems/spiral-matrix/description/?envType=list&envId=p2hezgy5
* Author @Vaibhavgetch
* */
public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.spiralOrder(matrix).forEach(num -> System.out.println(num + " "));
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int count = m * n;
        int fr = 0, fc = 0, lr = m - 1, lc = n - 1;
        List<Integer> ans = new ArrayList<>();
        while (count > 0) {

            // First row

            for (int j = fc; j <= lc; j++) {
                ans.add(matrix[fr][j]);
                count--;
            }
            fr++;
            if (count == 0) break;
            // Last column
            for (int i = fr; i <= lr; i++) {
                ans.add(matrix[i][lc]);
                count--;
            }
            lc--;
            if (count == 0) break;

            //Last row
            for (int j = lc; j >= fc; j--) {
                ans.add(matrix[lr][j]);
                count--;
            }
            lr--;
            if (count == 0) break;

            //First Column
            for (int i = lr; i >= fr; i--) {
                ans.add(matrix[i][fc]);
                count--;
            }
            fc++;
        }
        return ans;
    }
}
