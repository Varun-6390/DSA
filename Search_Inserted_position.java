// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
//  return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.


public class Search_Inserted_position {

     public static int searchInsert(int[] nums, int target) {
       int low=0, high=nums.length-1;
        while(low<=high){
            int middle = low+(high-low)/2;
            if(nums[middle]==target) return middle;
            else if(nums[middle]<target) low=middle+1;
            else high=middle-1;
        }return low; 
    }
}
