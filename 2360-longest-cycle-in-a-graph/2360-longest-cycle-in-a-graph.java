class Solution {
    int ans = -1;
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                    boolean[] vis, boolean[] path, int[] depth, int count) {
        vis[node] = true;
        path[node] = true;
        depth[node] = count;
        for (int next : adj.get(node)) {
            if (!vis[next]) {
                dfs(next, adj, vis, path, depth, count + 1);
            }
            else if (path[next]) {
                int cycleLength = count - depth[next] + 1;
                ans = Math.max(ans, cycleLength);
            }
        }
        path[node] = false;
    }
    public int longestCycle(int[] edges) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                adj.get(i).add(edges[i]);
            }
        }
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        int[] depth = new int[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, path, depth, 0);
            }
        }
        return ans;
    }
}