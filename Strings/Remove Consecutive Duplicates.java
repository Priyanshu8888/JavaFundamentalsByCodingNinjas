
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String s1 = "";
        int n = str.length();
        int min = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(min != str.charAt(i))
            {
                s1 = s1 + str.charAt(i);
            }
            min = str.charAt(i);
        }
        return s1;
        
	}

}