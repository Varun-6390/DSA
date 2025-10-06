import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 12, 56, 45, 89, 62, 10, 36 };
        Insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[]arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
