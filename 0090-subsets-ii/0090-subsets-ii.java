class Solution {

    public void findSubSet(int ind,int[] nums,List<Integer>ds,List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;//if first element is picked we dont go for next consecutive similar element
            ds.add(nums[i]);
            findSubSet(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        findSubSet(0,nums,ds,ans);
        return ans;
        
    }
}