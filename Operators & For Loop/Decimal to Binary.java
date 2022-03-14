import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.print(str);

	}
}
