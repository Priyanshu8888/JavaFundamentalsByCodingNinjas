import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
        int i, spaces, num;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(i=1; i<=n; i++){
            for(spaces=1; spaces<=n-i; spaces++){
                System.out.print(" ");
            }
            for(num=1; num<=i; num++){
                System.out.print(num);
            }
            System.out.println();
        }

		
	}

}
