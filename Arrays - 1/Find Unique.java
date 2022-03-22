public class Solution{  

    public static int findUnique(int[] arr){
		int n = arr.length;
        int result = arr[0];
        for(int i=1; i<n; i++)
        {
            result = result ^ arr[i];
        }
        return result;
    }
}