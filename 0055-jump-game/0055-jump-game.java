class Solution {
    //brute force requrired tc O(n raise to n) also  
    //this is greedy approach tc : O(N)
    public boolean canJump(int[] nums) {
        int goal=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }

        return goal==0;
    }
}