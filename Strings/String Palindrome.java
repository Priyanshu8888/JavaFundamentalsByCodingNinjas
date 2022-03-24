
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int n = str.length()-1;
        int i = 0;
        int j = n;
        while(i<=j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }return true;
	}

}