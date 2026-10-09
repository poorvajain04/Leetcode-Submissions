class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:times){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new int[] {v,w});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int wt=curr[0];
            int node=curr[1];
            if(wt>dist[node]) continue;
            for(int[] p:adj.get(node)){
                int nd=p[0];
                int dis=p[1];
                if(wt+dis<dist[nd]){
                    dist[nd]=dis+wt;
                    pq.add(new int[]{dist[nd],nd});
                }
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}