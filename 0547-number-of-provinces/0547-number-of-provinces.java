class Solution {
    public int findCircleNum(int[][] isConnected) {
        //used recursion
        int ans=0;
        int n=isConnected.length;
        boolean visit[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                ans++;
                dfs(i,visit,isConnected);
            }
        }
        return ans;
    }
    public void dfs(int node,boolean[] visit,int[][] isConnected){
        visit[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(!visit[i] && isConnected[node][i]==1) dfs(i,visit,isConnected);
        }
    }
}