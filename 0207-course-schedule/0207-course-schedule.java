class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] e:prerequisites){
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int next:graph.get(node)){
                indegree[next]--;
                if(indegree[next]==0) q.add(next);
            }
        }
        return count==numCourses;
    }
}