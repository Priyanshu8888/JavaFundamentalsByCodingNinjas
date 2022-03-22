
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int left=0;
        int right=n-1;
        int count=1;
        while(left<=right){
            
            if(count%2==1){
                arr[left]=count;
                left++;
                count++;
            }
           
            else{
                arr[right]=count;
                right--;
                count++;
            }
        }
    }
}