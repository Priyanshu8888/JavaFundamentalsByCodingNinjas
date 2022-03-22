public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n=arr.length;
         for (int i = 0; i < n; i++){
              for (int j = 0; j < n; j++){
                  if(arr[i]==arr[j] && i != j)
                  {
                      return arr[i];
                  }
              }
         }
         return Integer.MAX_VALUE;
    }
}
