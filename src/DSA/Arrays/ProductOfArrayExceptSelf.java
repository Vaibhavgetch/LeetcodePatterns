package DSA.Arrays;

import java.util.Arrays;

/*
 *   Leetcode : 238
 * */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] ans = productExceptSelf3(nums);

        for (int num : ans) {
            System.out.println(num + " ");
        }
    }

    /*
     *  Brute Force : O(n^2) time complexity : Got TLE
     * */
    public int[] productExceptSelf1(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                prod *= nums[j];
            }
            ans[i] = prod;
        }
        return ans;
    }

    /*
     *  With extra O(n) space,
     * */
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        boolean isZeroPresent = false;
        int product = 1;

        for (int num : nums) {
            if (num == 0) {
                isZeroPresent = true;
                continue;
            }
            product *= num;
        }

        for (int i = 0; i < n; i++) {
            if (isZeroPresent) {
                if (nums[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = product / nums[i];
            }
        }
        return ans;
    }

    public static int[] productExceptSelf3(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i] * curr;
            curr = curr * nums[i];
        }
        // {1, 2, 6, 24}
        curr = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * curr;
            curr *= nums[i];
        }
        return ans;
    }

}
