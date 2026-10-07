class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        int[] ind = new int[n];
        for (int[] e : richer) {
            int u = e[0]; 
            int v = e[1]; 
            g.get(u).add(v);
            ind[v]++;
        }
        int[] ans = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ans[i] = i; 
            if (ind[i] == 0) {
                q.add(i); 
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g.get(u)) {
                if (quiet[ans[u]] < quiet[ans[v]]) {
                    ans[v] = ans[u];
                }
                ind[v]--;
                if (ind[v] == 0) {
                    q.add(v);
                }
            }
        }
        return ans;
    }
}