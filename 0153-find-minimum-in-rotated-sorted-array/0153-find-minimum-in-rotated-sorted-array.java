class Solution {
    public int findMin(int[] nums) {
        // tc : O(log n)
        // for duplicats ?
        int min=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            //search space is already sorted then always nums[low] will be smaller in the search space
            if(nums[low]<=nums[high]){
                min=Math.min(min,nums[low]);
                break;
            }
            //check if left half is sorted or not if yes small element may be in right part and 
            //eliminate left part
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            //else right part is sorted eliminated right part because point of rotation is on left and small element may be on left side 
            else{
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}