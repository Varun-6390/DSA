// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
// 1342. Number of Steps to Reduce a Number to Zero

public class FindSteps {
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
