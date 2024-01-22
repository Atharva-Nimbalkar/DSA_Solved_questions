
class Solution { //tc:O(logn)
    int mod=(int)1e9+7;
    public long Power(long x,long y){
        
        if(y==0)return 1;
        long ans=Power(x,y/2);
        ans*=ans;
        ans%=mod;
        if(y%2!=0){
            ans*=x;
            ans%=mod;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=n/2+n%2;
        return (int)((Power(5,even)*Power(4,odd))%mod);
    }
}