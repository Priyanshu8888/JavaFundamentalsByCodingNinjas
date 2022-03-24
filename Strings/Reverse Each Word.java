
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        String[] arr = str.split(" ");
        String revString = "";
        for(int i = 0; i<arr.length; i++)
        {
            String word = arr[i];
            String revword = "";
            for(int j = word.length()-1; j >= 0; j--)
            {
                revword = revword + word.charAt(j);
            }
            revString =  revString + revword + " ";
        }
        return revString;    
	}

}