import java.util.Scanner;


public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        char ch = str.charAt(0);
        
        if(ch>=65 && ch<=90)
        {
            System.out.print(1);
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.print(0);
        }
        else{
            System.out.print(-1);
        }

    }
}