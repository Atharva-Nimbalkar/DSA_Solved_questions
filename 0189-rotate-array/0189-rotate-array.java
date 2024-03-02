class Solution {

    public static void reverse(int nums[],int i,int j){
        int l_ind=i;
        int r_ind=j;

        while(l_ind<r_ind){
            int temp=nums[l_ind];
            nums[l_ind]=nums[r_ind];
            nums[r_ind]=temp;

            l_ind++;
            r_ind--;
        }


    }
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
       if(k<0){
           k+=nums.length;
       }
       reverse(nums,0,nums.length-k-1);
       reverse(nums,nums.length-k,nums.length-1);
       reverse(nums,0,nums.length-1);
    }
}