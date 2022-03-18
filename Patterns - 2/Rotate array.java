
public class Solution {
    
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        int[] arr2 = new int[d];
        
//         first d elemnts in arr2
        int i = 0;
        while(i<d)
        {
            arr2[i]=arr[i];
            i++;
        }
        
//         n-d elements shifting at front
        i = 0;
        while(i<n-d)
        {
            arr[i]=arr[d+i];
            i++;
        }
        
//         last d elemnts are placed at there correct positions
        i=0;
        while(i<d)
        {
            arr[n-d+i] = arr2[i];
            i++;
        }
        
    }
}