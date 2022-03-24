import java.util.*;

public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
        int n = str.length();
        int count =1;
        if(n==0)
        {
            return 0;
        }
        for(int i=0; i<n; i++)
        {
            if(str.charAt(i)==' ' &&  str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
        
	}

}