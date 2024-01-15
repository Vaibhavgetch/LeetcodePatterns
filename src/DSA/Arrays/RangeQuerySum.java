package DSA.Arrays;

/*
* Leetcode : 303
* */
public class RangeQuerySum {

    int[] prefix;

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};

        RangeQuerySum obj = new RangeQuerySum(nums);
        int sumRange = obj.sumRange(2, 5);
        System.out.println(sumRange);

    }
    public RangeQuerySum(int[] nums) {
        prefix = new int[nums.length + 1];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = left == 0 ? 0 : prefix[left - 1];
        return rightSum - leftSum;
    }
}
