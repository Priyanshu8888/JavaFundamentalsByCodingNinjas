import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int temp = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=2; i<=n; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    temp += 1;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp = 0;
            }
        }

		
	}
}
