import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 3, 8, 5 };
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
