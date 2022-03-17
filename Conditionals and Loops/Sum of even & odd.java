import java.util.Scanner; 

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        int even, odd, N, r;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        even = 0;
        odd = 0;
        while(N > 0){
            r =N%10;
            if(N%2== 0){
                even = even + r;
            }
            else{
                odd = odd + r;
            }
            N=N/10;
        }
        System.out.println(even + " " + odd);     
       
	}
}
