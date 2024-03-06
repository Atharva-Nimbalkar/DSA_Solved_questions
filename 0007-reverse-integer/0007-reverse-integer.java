class Solution {
    public int reverse(int x) {
       boolean isNeg=x<0;
       
       x=Math.abs(x);
       int rev=0;
        
       while(x>0){
           if(Integer.MAX_VALUE/10<rev) return 0;

           rev=10*rev+x%10;
           x/=10;
       }

       return isNeg ? -rev : rev;
    }
}