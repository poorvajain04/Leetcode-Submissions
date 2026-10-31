class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minDist = new int[n];
        Arrays.fill(minDist, Integer.MAX_VALUE);
        minDist[0] = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int node = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && minDist[j] < min) {
                    min = minDist[j];
                    node = j;
                }
            }
            visited[node] = true;
            sum += min;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    int dist = Math.abs(points[node][0] - points[j][0])
                             + Math.abs(points[node][1] - points[j][1]);
                    minDist[j] = Math.min(minDist[j], dist);
                }
            }
        }
        return sum;
    }
}