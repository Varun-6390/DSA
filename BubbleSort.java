import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 6, 4, 3, 2, 1, 0, 8, 9, 5, 23, 56, 15 };
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}
