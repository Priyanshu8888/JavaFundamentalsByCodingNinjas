
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n)
        {
            arr3[k]=arr1[i];
            k++;
            i++;    
        }
        while(j<m)
        {
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        return arr3;
    }

}