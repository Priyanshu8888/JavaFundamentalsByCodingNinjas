
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}