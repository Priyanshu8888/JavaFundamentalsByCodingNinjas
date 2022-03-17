import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        double basic, hra, da, pf, ts;
        Scanner s = new Scanner(System.in);
        basic = s.nextInt();
        String str = s.next();
        char grade = str.charAt(0);
        
        hra = 0.2 * basic;
        da = 0.5 * basic;
        pf = 0.11 * basic;
        
        if(grade == 'A'){
            ts = (basic + hra + da + 1700 - pf);
        }
        else if(grade == 'B'){
            ts = (basic + hra + da + 1500 - pf);
        }
        else{
            ts = (basic + hra + da + 1300 - pf);
        }
        
        System.out.println(Math.round(ts));
	}
}

