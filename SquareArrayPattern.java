package Arrays;

public class SquareArrayPattern {
	public static void main(String[] args) {
		int number = 5;
		int array[][] = new int[number][number];
		int limit = 0;
		int length = number;
		int start = 0;
		int end = number - 1;
		while (limit < number) {
			for (int i = start; i <=end; i++) {
				for (int j = start; j <=end; j++) {
					if (i == start || i == end || j == start || j == end) {
						array[i][j] = number;	}
				}
			}
			start++;
			number--;
			end--;
			limit++;}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++)
				System.out.print(array[i][j]);
			System.out.println();}
	}

}
