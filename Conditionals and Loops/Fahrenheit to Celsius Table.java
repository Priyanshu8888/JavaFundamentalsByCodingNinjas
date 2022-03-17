import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int S, E, W; 
        Scanner s = new Scanner(System.in);
        
        S = s.nextInt();
        E = s.nextInt();
        W = s.nextInt();
         while(S<=E){
               int ans=S;
             ans=(S-32)*5/9; 
         System.out.println(S+"\t"+ans);
            S = S + W;
         }
        }

}
