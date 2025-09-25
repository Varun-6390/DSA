public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 10, 12, 18};
        
        int ans = linearsearch(arr, 12);
        System.out.println("Element found at index: " + ans);
    }

    static int linearsearch(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(target == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}
