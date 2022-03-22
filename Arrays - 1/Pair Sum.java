public class Solution {  

    public static int pairSum(int arr[], int x) {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(i!=j && (arr[i]+arr[j])==x)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}