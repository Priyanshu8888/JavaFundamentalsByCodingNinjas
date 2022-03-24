
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        int n = str.length();
        String s1 = "";
        int temp = (int)ch;
        for(int i=0; i<n; i++)
        {
            if(str.charAt(i)!=temp)
            {
                s1 = s1 + str.charAt(i);
            }
        }
        return s1;
	}

}
