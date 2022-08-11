// Code wont't work here
// Input:
// N = 4
// Q[] = {8, 15, 3, 7}
// Output: 22
// Explanation: Player X starts and picks 7. Player Y 
// picks the pot containing 8. Player X picks the pot
// containing 15. Player Y picks 3.
// Total coins collected by X = 7 + 15 = 22.

class GfG {
    public static int[][] dp = new int[1001][1001];

    public static int maxCoins(int A[], int n) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                dp[i][j] = -1;
            }
        }
        return Max(A, 0, n - 1);
    }

    public static int Max(int A[], int start, int end) {
        if (start > end) {
            return 0;
        }
        if (dp[start][end] != -1) {
            return dp[start][end];
        }
        int aa = A[start] + Math.min(Max(A, start + 2, end), Max(A, start + 1, end - 1));
        int bb = A[end] + Math.min(Max(A, start + 1, end - 1), Max(A, start, end - 2));
        int res = Math.max(aa, bb);
        dp[start][end] = res;
        return res;
    }
}