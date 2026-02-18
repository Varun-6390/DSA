// https://leetcode.com/problems/contains-duplicate/
import java.util.Arrays;
class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        System.out.println(Duplicate(arr));
        System.out.println(containsDuplicate(arr));
    }

    static boolean Duplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    //optimal approach

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            return true;
        }
        return false;
    }
}