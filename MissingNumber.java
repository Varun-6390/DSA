//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (nums[0] != 0) {
            return 0;
        }
        if (nums[n - 1] != n) {
            return n;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;
    }


    //Optimised Solution
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int k = 0;

        for (int i : nums) {
            k += i;
        }
        return sum - k;
    }
}

