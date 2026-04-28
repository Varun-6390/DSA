// https://leetcode.com/problems/rearrange-array-elements-by-sign
import java.util.Arrays;

public class RearrangeArray { 
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int a = 0;
        int b = 1;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                ans[a] = nums[i];
                a += 2;
            }
            else
            {
                ans[b] = nums[i];
                b += 2;
            }
        }
        return ans;
    }
}
