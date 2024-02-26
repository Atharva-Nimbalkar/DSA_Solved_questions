class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        func(0,s,path,res);
        return res;
    }

    void func(int index,String s,List<String>path,List<List<String>>res){
        if(index==s.length()){//comes at right end or n stop
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){//if prvious substring are palindrome go for next index
            path.add(s.substring(index,i+1));
            func(i+1,s,path,res);
            path.remove(path.size()-1);//remove b(left side )after recurison callback so that u get bb(right) 
            }
        }
}
        boolean isPalindrome(String s,int start,int end){
            while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--))
                return false;
            }
            return true;
        }    
}