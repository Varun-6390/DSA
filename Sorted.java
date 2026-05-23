// Check whether the array is sorted or not using recursion

public class Sorted {
    public static void main(String[] args) { 
        int arr[] =  {2,4,5,7,9,10};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index)
    {
        if(index == arr.length - 1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index + 1);
    }
}

