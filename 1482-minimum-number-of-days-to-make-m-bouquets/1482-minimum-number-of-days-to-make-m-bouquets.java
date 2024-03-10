class Solution {
    // Time complexity:O(nlogm)
// Space complexity:O(1)
    //it has polarity
    
    public int minDays(int[] bloomDay, int m, int k) {
       if((long)m*k>bloomDay.length) return -1;

       int low=1,high=1,mid;
       for(int i:bloomDay){
           low=Math.min(low,i);
           high=Math.max(high,i);
       }

       while(low<high){
           mid=low+(high-low)/2;
           if(canmake(mid,m,k,bloomDay)){
               high=mid;
           }
           else{
               low=mid+1;
           }
       }
       return low;
    }

    private boolean canmake(int mid,int bouquet,int flowers,int[] bloomDay){
        int count=0;
        for(int i:bloomDay){
            if(i<=mid){
                count++;
                if(count==flowers){
                    bouquet--;
                    count=0;
                    if(bouquet==0) return true;
                }
            }
            else count=0;
        }
        return false;
    }
}