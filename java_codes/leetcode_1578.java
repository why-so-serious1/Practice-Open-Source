
// Please run on leetcode compiler to check results
//Leetcode 1578

/**
* Input: colors = "abaac", neededTime = [1,2,3,4,5]
* Output: 3
* Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
                Bob can remove the blue balloon at index 2. This takes 3 seconds.
                There are no longer two consecutive balloons of the same color. Total time = 3.
 */
class Solution {
    public int minCost(String str, int[] arr) {
        int n = str.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return helper(str, arr, 0, dp);
    }

    public int helper(String str, int[] arr, int index, int[] dp) {
        if (index == str.length() - 1) {
            dp[index] = 0;
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }
        if (str.charAt(index) == str.charAt(index + 1)) {
            if (arr[index + 1] < arr[index]) {
                int temp = arr[index + 1];
                arr[index + 1] = arr[index];
                arr[index] = temp;
            }
            dp[index] = Math.min(arr[index], arr[index + 1]) + helper(str, arr, index + 1, dp);
            return dp[index];
        } else {
            dp[index] = helper(str, arr, index + 1, dp);
            return dp[index];
        }
    }

}