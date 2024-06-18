class Solution {
    //Just store the left and right product (Try doing this with extra space first)
//This one is constant space because we are returning the array we created
//In first pass calculate the left product except self and in second calculate the right
// tc O(n) 
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) output[i + 1] =
            output[i] * nums[i];

        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i + 1];
        }
        return output;
    }
}