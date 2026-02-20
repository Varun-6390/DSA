// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int ans[] = { -1, -1 };

        while (left < right) {
            int total = numbers[right] + numbers[left];
            if (total == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }
            if (total < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
