class Solution {
       //this is optimal solution
    //tc:O(2*2n)
    //sc :O(1)
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)- helper(nums,k-1);
    }

    public static int helper(int[] nums,int k){
        int cnt=0,l=0,r=0,sum=0;
        while(r<nums.length){
            if(nums[r]%2==1) sum++;
            while(sum>k){
                if(nums[l]%2==1) sum--;
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}