package atharva.StringNStringBuilder;
//accenture pvq
public class Strdecoder {
    public static String strdecoder(String s){

        StringBuilder ans=new StringBuilder("");
        if(s.length()==0) return ans.toString();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans.append((char) (count+64));
                count=0;
            }else{
                count++;
            }
        }
        if(count>0) ans.append((char) (count+64));
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(strdecoder("11101111011111"));
    }
}
