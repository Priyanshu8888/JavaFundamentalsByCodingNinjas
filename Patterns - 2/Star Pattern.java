import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
        int i, spaces, stars, dec;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(i=1; i<=n; i++){
            for(spaces=1; spaces<=n-i; spaces++){
                System.out.print(" ");
            }
            for(stars=1; stars<=i; stars++){
                System.out.print("*");
            }
            for(dec=i-1; dec>=1; dec--){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
