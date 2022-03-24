public class Solution {
    public static String getCompressedString(String str) {
    String op="";
        int n=1;
        op+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                {
                    n++;
                continue;
                }
            if(n>1){
                op=op+(char)(n+48)+str.charAt(i);
                n=1;
            }
            else{
                op=op+str.charAt(i);
            }
            
        }
    
     if(n>1)
    op=op+(char)(n+48);
           
        return op;
            
    
    }
    }	