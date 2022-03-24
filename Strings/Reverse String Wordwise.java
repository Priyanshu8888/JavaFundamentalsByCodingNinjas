public class Solution {
    
    public static String reverseWordWise(String input) {
        
        String arr[]=input.split(" ");
        int n=arr.length;
        String temp="";
        
        for(int i=n-1;i>=0;i--){
           
            temp=temp+arr[i]+" ";
        }

        return temp;
    }
}
