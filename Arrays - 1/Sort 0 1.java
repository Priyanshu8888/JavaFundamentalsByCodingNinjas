import java.util.*;
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int zero_count = 0;
        int one_count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
            {
                zero_count++;
            }
            else
            {
                one_count++;
            }
        }
        int i;
        // overriding with respective number of zeros and ones
        for(i=0; i<zero_count; i++)
        {
            arr[i] = 0;
        }
        for(i=zero_count; i<arr.length; i++)
        {
            arr[i] = 1;
        }
    }
}