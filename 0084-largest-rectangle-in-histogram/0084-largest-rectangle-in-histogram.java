class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int nsr[]=new int[heights.length];
        int nsl[]=new int [heights.length];
        int area=0;
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=heights.length;
            }
            else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }

        st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }   
            if(st.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<heights.length;i++){
            int ht=heights[i];
            int wt=nsr[i]-nsl[i]-1;
            int currArea=ht*wt;
            area=Math.max(area,currArea);
        }
    return area;
    }

}