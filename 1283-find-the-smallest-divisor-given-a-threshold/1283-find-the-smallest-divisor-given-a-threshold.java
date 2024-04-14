class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        if(n>threshold) return -1;//we use bs even array is not sorted and 
        // Upon closer observation, we can recognize that our answer space, represented as [1, max(arr[])], is actually sorted.
        int ans=-1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){//we need smallest divisor so range will from (1 to max(arr[]))
            maxi=Math.max(maxi,nums[i]);
        }

        int low=1;
        int high=maxi;

    //apply bs
        while(low<=high){
            int mid=(low+high)/2;
            if(sumByD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int sumByD(int[] nums,int divisor){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }
}