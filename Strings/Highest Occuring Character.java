
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        str = str.replaceAll("\\s",""); //[This step is for replacing spaces]
        int n = str.length();
        int[] arr = new int[256];
        for(int i = 0; i<n; i++)
        {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }
        int max = Integer.MIN_VALUE;
        char c = ' ';
        for(int i = 0; i<n; i++)
        {
            if(max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        return c;
	}

}