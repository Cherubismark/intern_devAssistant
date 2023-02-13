public class FindMaxOf_APrintout {
    public int maxA(int N) {
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) { // to iterate the whole process
            dp[i] = dp[i - 1] + 1;
            for (int j = 2; j <= i - 2; j++) {
                dp[i] = Math.max(dp[i], dp[j - 2] * (i - j + 1));
            }
        }
        return dp[N];
    }

    public static void main(String[] args) {

    }
}
