// finding index of element in a sorted array of infinite length.

public class FindinInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 9, 11, 15, 20};
        int target = 11;
        int Ans = ans(arr, target);
        System.out.println(Ans);
    }

    static int ans(int[] arr, int target)
    {
        int start = 0;
        int end = 1;

        while(arr[end] < target)
        {
            int newStart = end + 1;
            end = (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
     static int binarySearch(int[] arr, int target,int start,int end)
    {
    
        while(start <= end)
        {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            } 
        }
        return -1;
    }
}
