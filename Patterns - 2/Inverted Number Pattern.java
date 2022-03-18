import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i+1; j++){
                System.out.print(n-i+1);
            }
            System.out.println("");
        }
		
	}

}
