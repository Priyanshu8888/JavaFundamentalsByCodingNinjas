import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int n, i;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(i = 2;  i<n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
                
        
    }
}