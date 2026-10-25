class Solution {
    public long minimumCost(String source, String target,
                            char[] original, char[] changed, int[] cost) {
        int n = 26;
        long INF = 1000000000000L;
        long[][] matrix = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = INF;
            }
            matrix[i][i] = 0;
        }
        for (int i = 0; i < cost.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            matrix[u][v] = Math.min(matrix[u][v], cost[i]);
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] != INF && matrix[k][j] != INF) {
                        matrix[i][j] = Math.min(
                            matrix[i][j],
                            matrix[i][k] + matrix[k][j]
                        );
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if (matrix[u][v] == INF) {
                return -1;
            }
            ans += matrix[u][v];
        }
        return ans;
    }
}