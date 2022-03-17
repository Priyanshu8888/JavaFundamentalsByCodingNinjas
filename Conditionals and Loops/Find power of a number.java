import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int n, p, i, result=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        p = s.nextInt();
        for(i = 1; i<=p; i++)
        {
            result = n*result;
        }
        System.out.print(result);
    
    }
}