class Solution {
    public int characterReplacement(String s, int k) {
        // TC:(O*26)
        // Optimized O(n)
        int[] arr=new int[26];
        int ans=0;
        int max=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            arr[s.charAt(j)-'A']++;
            max=Math.max(max,arr[s.charAt(j)-'A']);
            if(j-i+1-max>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}