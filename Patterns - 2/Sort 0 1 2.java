
public class Solution {

    public static void sort012(int[] arr){
    	int n = arr.length;
        int ZEROS = 0;
        int ONES= 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
            {
                ZEROS++;
            }
            if(arr[i]==1)
            {
                ONES++;
            }
        }
        for(int i=0; i<ZEROS; i++)
        {
            arr[i]=0;
        }
        for(int i=ZEROS; i<(ZEROS+ONES); i++)
        {
            arr[i]=1;
        }
        for(int i=(ZEROS+ONES); i<n; i++)
        {
            arr[i]=2;
        }
    }

}