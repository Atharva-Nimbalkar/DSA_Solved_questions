class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
//use bfs algo 
//sc O(n*m) nearly
//tc O(n*m*4) overall
class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair>q=new LinkedList<Pair>();
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        //check first and last row,col have land cell or not .if yes land cell which are connected to boundry cell can move 
        //but we dont want to move off the boundary 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();//make sure you remove pair from queue

            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }

        //now we avoid boundry cells now just count land cells enclosed in enclaves
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 & vis[i][j]==0){//as we not tamper original data so we created visited array(copy of input)
                    cnt++;
                }
            }
        }
        return cnt;
    }   
}