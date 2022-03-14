import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		int i;
		for(i = 0; i < size; i++)
		{
			a[i] = s.nextInt();
		}
        int p;
        if(a[0] > a[1]){
            p = 1;
        }
        else{
            p = -1;
        }
		int n = p;
		int c = 0;
		for(i = 1; i < size - 1; i++)
		{
            if(a[i] > a[i+1]){
                n = 1;
            }
            else{
                n = -1;
            }
			if(n == p)
				p = n;
			else 
			{
				p = n;
				c++;
				if(c > 1)
					break;
			}
				
		}
		
		if(i + 1 == size)
			System.out.println("true");
		else
			System.out.println("false");
	}
}