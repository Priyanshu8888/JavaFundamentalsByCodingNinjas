public class Solution {

	public static void printFahrenheitTable(int S, int E, int W) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        for(int i=S; i<=E; i+=W)
        {
            int celsius_value = ((i-32)*5)/9;
            System.out.println(i+"\t"+ celsius_value);
        }
		
	}
}