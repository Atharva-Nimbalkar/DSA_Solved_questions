class Solution {
    public int totalFruit(int[] fruits) {
        //tc: O(2n)
        // sc O(3) worst case
        //better approach most of time use this ask recuiter
        int l=0,r=0,sum=0;
        int len=fruits.length;
        HashMap<Integer,Integer>hmap=new HashMap<>();
        int i=0;
        int j=0;
        while(j<len){
            hmap.put(fruits[j],hmap.getOrDefault(fruits[j],0)+1);
            while(hmap.size()>2){
                hmap.put(fruits[i],hmap.get(fruits[i])-1);
                if(hmap.get(fruits[i])==0) hmap.remove(fruits[i]);
                i++;
            }
            sum=Math.max(sum,j-i+1);
            j++;
        }
        return sum;
    }   
}