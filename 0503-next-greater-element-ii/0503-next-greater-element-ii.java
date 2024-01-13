class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nextGreater[]=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        for(int i=(2*nums.length)-1;i>=0;i--){//O(n)
            while(!st.isEmpty()&& nums[st.peek()]<=nums[i%n]){//note : we store index in stack
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i%n]=-1;
            }
            else{
                nextGreater[i%n]=nums[st.peek()];
            }
            st.push(i%n);
        }
        return nextGreater;
    }
}