import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        int no, i, ans;
        
        Scanner s = new Scanner(System.in);
        no = s.nextInt();
        for(i = 1;i<=10;i++)
        {
            ans=(no*i);
            System.out.println(ans);
        }
    }
}