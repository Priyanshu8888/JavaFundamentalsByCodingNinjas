import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int i, j;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(i=1; i<=n; i++){
            char p = (char)('A'+i-1);
            for(j=1; j<=i; j++){
                System.out.print(p);
                p++;
            }
            System.out.println("");
        }

		
	}

}