// https://leetcode.com/problems/search-in-rotated-sorted-array
//33. Search in Rotated Sorted Array

public class Search_in_RotatedArray {
    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 15, 18, 1, 2, 3, 5 };
        int target = 2;
        int ans = Search(nums, target, 0, nums.length - 1);
        System.out.println(ans);
    }

    static int Search(int[] nums, int target, int start, int end) {
        int pivot = Findpivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, start, end);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int Findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


