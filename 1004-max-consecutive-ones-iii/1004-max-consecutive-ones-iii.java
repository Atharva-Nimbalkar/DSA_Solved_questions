class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int window=0;
        int cnt=0;
        for(int right=0;right<nums.length;right++){
            window+=nums[right];
            while(window+k < right-left+1){
                window-=nums[left];
                left++;
            }
            cnt=Math.max(cnt,right-left+1);
        }
        return cnt;
    }
}