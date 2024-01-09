class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int ans=0;
        int sum=0;
        int fre=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);//if entir aray give sum as 0 so we add it in hashmap as intialize condition
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}