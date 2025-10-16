//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

//34. Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;

public class FindFirstandLast {

    public static void main(String[] args)
    {
        int[] arr = {2,5,8,8,8,9,9,12,15};
        int target = 8;
        int[] ans = {-1,-1};
        int start = searchFirst(arr,target,true);
        int end = searchFirst(arr,target,false);
        ans[0] = start;
        ans[1] = end;

        System.out.println(Arrays.toString(ans));      
    }

    static int searchFirst(int[] nums, int target, boolean isFirst)
    {
        int start = 0;
        int end  = nums.length - 1;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target > nums[mid])
            {
                start = mid + 1;
            }
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                ans = mid;

                if(isFirst)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            } 
        }
        return ans;
    }
}


