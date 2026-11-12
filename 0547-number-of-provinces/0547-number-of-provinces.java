class Solution {
    public void dfs(int[][] connected, int[] visited, int i){
        if(visited[i]!=0) return;
        visited[i]=1;
        int n=connected.length;
        for(int j=0;j<n;j++){
            if(visited[j]==0 && (connected[i][j]!=0 || connected[j][i]!=0)) dfs(connected,visited,j);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] visited=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                ans++;
                dfs(isConnected, visited,i);
            }
        }
    return ans;
    }
}