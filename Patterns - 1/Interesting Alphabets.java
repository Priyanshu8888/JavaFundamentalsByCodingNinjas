import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		int i, j;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(i=1; i<=n; i++){
            char p = (char)(('A'+n)-i);
            for(j=1; j<=i; j++){
                System.out.print(p);
                p++;
            }
            System.out.println("");
        }
	}
}