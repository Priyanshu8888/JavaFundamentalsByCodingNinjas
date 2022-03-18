public class Solution {  

    public static int secondLargestElement(int[] arr) {    
        int n = arr.length;
        int max = Integer.MIN_VALUE;
		int check = 0;
        int index = 0;
        
        if(n <= 1){
            return Integer.MIN_VALUE;
        }
		
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
                index = i;
			}
		}
        check = max;
		arr[index] = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				if(arr[i] == check) {
					arr[i] = Integer.MIN_VALUE;
				}
				else {
				max = arr[i];
				}
			}
		}
		return max;
    }

}