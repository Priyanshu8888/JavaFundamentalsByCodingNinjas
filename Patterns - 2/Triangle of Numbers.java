
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            int store=0;
            for(int j=0;j<i;j++)
            {
                System.out.print(i+j);
                store=i+j;
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(store-j);
            }
            System.out.println();
            
            
        }
		
	}

}