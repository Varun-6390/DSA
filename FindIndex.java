// finding all indices of the target element in a array using recursion
 
import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,7,8,9};
        System.out.println(findAllIndex(arr, 8, 0, new ArrayList<Integer>()));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}

