class Solution {
    private int m;
    private int n;

    public int numIslands(char[][] grid) {
        m=grid.length;
        if(m==0) return 0;
        n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    DFSMarking(grid,i,j);
                    ++count;
                }
            }
        }
        return count;
    }

private void DFSMarking(char[][] grid,int i,int j){
    if(i<0 || j<0 || i>=m | j>=n || grid[i][j]!='1') return;
    grid[i][j]='0';
    DFSMarking(grid,i+1,j);
    DFSMarking(grid,i-1,j);
    DFSMarking(grid,i,j+1);
    DFSMarking(grid,i,j-1);
}
}