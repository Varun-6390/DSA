// https://leetcode.com/problems/majority-element

//69. Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1,3,5};
        int ans = majorityElement(arr);
        System.out.println(ans);

    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}

