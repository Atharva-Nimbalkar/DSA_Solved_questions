class Solution {
    //TC: O(N*log(maxEl))
    //it has polarity
    //use bs if u know ans lie in range
    public static int maxEl(int piles[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    } 

    public static int calculateHrs(int piles[],int mid){
        int  totalH=0;
        for(int i=0;i<piles.length;i++){
            totalH+=Math.ceil((double)piles[i]/(double)mid);//why double
        }
        return totalH;

    }
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=maxEl(piles);
       while(low<=high){
           int mid=(low+high)/2;
           int totHrs=calculateHrs(piles,mid);
           if(totHrs<=h){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        return low;
    }

}