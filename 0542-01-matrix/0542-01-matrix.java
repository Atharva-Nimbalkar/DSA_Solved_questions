class Node{
    int i;
    int j;
    int distance;
    Node(int i,int j,int distance){
        this.i=i;
        this.j=j;
        this.distance=distance;
    }
    
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //bfs used 
        int m=mat.length;
        int n=mat[0].length;
        int dist[][]=new int[m][n];
        int vis[][]=new int[m][n];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }else{
                    vis[i][j]=0;
                }
            }
        }
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        
        // n*m*4
        while(!q.isEmpty()){
           int row=q.peek().i;
           int col=q.peek().j;
           int steps=q.peek().distance;
           q.remove();
           dist[row][col]=steps;
           for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
            
            
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                vis[nrow][ncol]=1;
                q.add(new Node(nrow,ncol,steps+1));
            }
        }
    }
    return dist;
}
}