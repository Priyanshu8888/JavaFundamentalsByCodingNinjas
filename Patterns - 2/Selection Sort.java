
public class Solution {  

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
			int min = arr[i];
			for(int j = i+1; j < n; j++) {
				if(arr[j] < min) {
					min = arr[j];
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			
			}
		}
        
    }   

}