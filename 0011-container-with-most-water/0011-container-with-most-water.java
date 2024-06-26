class Solution {
    public int maxArea(int[] height) {
        // tc O(n) sc (1)
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int containerWidth=r-l;
            int area=containerWidth*Math.min(height[l],height[r]);
            res=Math.max(res,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        // Since each iteration of the loop moves one of the pointers one step closer to the other, and the loop will terminate after at most n-1 steps (where n is the length of the height array), the loop runs in linear time.
        
        return res;
    }
}