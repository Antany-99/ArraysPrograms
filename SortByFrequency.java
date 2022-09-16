package Array;
public class SortByFrequency {
	public static void main(String[] args) {			
		int[] arr = { 2, 5, 2, 8, 5, 6, 8, 8 };
		int[] arr1 = new int[arr.length];
		int visit = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr1[j] = visit;}
			}
			if (arr1[i] != visit) {
				arr1[i] = count;}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					int temp1 = arr[i];
					arr1[i] = arr1[j];
					arr[i] = arr[j];
					arr[j] = temp1;
					arr1[j] = temp;}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1[i]; j++) {  
				System.out.print(arr[i] + " ");}
		}		
	}
}
