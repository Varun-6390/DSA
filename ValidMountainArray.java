// https://leetcode.com/problems/valid-mountain-array/
class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        // Step 1: Length check
        if (n < 3) return false;
        
        int i = 0;
        
        // Step 2: Climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Step 3: Peak can't be first or last
        if (i == 0 || i == n - 1) {
            return false;
        }
        
        // Step 4: Walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        
        // Step 5: Must reach end
        return i == n - 1;
    }
}
