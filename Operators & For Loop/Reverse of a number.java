import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        int last_digit, rev=0;
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            last_digit = n%10;
            rev = rev*10+last_digit;
            n=n/10;
        }
        System.out.print(rev);

	}
}
