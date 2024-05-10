class Solution {
    //we use dfs here 
    //
    //tc let (n*m)=x 
    //OC(X*4)+x=>O(X)=>O(n*m)
    // SC O(n*m) //store anser in differenct matix we dont include about delRow,delCol
    private void dfs(int row,int col,int[][] ans,int[][] image,int color,int[] delRow,int[] delCol,int iniColor){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){//exactly four directions
            int nrow=row+delRow[i];//instead of writing each block about four direction we create delRow,delCol 
            int ncol=col+delCol[i];//like row-1=>-1,row+1=>+1,col-1=>-1,row+0 (column moved) etc
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
            && image[nrow][ncol]==iniColor && image[nrow][ncol] !=color ){
                dfs(nrow, ncol, ans,image, color, delRow,delCol, iniColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor=image[sr][sc];
        int[][] ans=image;
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};
        dfs(sr,sc,ans,image,color,delRow,delCol,iniColor);
        return ans;

    }
}