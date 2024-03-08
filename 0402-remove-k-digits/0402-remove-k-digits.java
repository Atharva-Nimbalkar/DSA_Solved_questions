class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character>st=new Stack<>();
        if(num.length()==k) return "0";

        int i=0;
        while(i<num.length()){
            while((k>0 && !st.isEmpty()) && (st.peek()>num.charAt(i))){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }

        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }

        //deleteCharAt is a linear time operation. If you remove a character at the head, the characters will have to be moved forward by one position each time. On the other hand, removing the tail character can be achieved in constant time as there would be no shifting involved! :)
        //instead of this 
        // res.reverse();
        // while(res.length()>1 && res.charAt(0)=='0')
        //     res.deleteCharAt(0);
        // return res.toString();

        // use this
        while(res.length() > 1 && res.charAt(res.length()-1) == '0')
            res.deleteCharAt(res.length()-1);
        return res.reverse().toString();


    }
}