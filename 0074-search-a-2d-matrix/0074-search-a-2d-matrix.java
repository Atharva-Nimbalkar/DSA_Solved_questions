class Solution {
       
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force Tc: O(nsqaure) bcz it row and col wise sorted
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Better than BS:
       
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            // int row=mid/m; 
            // int col=mid%m;
            
            if(matrix[mid/m][mid%m]==target) return true;
            else if(matrix[mid/m][mid%m]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}