class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();   
        Stack<Integer>st=new Stack<>();
        for(int num:nums2){
            while(!st.empty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }
}