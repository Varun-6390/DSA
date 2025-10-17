public class BinarySearchRecursion {
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,9,12,56,89};
        int ans = search(nums, 12, 0, nums.length - 1);
        System.out.println("Element found at index: " + ans);
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }
        return search(arr, target, mid + 1, e);
    }
}

