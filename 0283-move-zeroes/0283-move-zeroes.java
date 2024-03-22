class Solution {
    public void moveZeroes(int[] nums) {
        //using two pointer solved this
        //one for keep track of non-zero elemetns(i.e nonZeroIndex) 
        //another pointer for traverse the array
        if(nums.length==1){
            return;
        }

        int nonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZero]=nums[i];
                nonZero++;
            }
        }

        while(nonZero<nums.length){
            nums[nonZero]=0;
            nonZero++;
        }   
    }
}