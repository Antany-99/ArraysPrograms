package Array;

public class FrequencyArray {
	public static void main(String[] args) {
		int a[]= { 2, 5, 2, 8, 5, 6, 8, 8 };
		int count = 1;
		int i, j;
		for (i = 0; i < a.length; i++) {
			if (a[i] != '0' && a[i] != ' ') {
				count =1;
				for (j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						a[j] = '0';}
				}
				System.out.print(a[i]+" "+count);
				System.out.println();}
			}
		} 
}
