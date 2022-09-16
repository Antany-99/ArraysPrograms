package Array;

public class SquareArrayPattern {
	public static void main(String[] args) {
		int n = 5;
		int a[][] = new int[n][n];
		int limit = 0;
		int s = n;
		int l = 0;
		int r = n - 1;
		while (limit < n) {
			for (int i = l; i <=r; i++) {
				for (int j = l; j <=r; j++) {
					if (i == l || i == r || j == l || j == r) {
						a[i][j] = n;	}
				}
			}
			l++;
			n--;
			r--;
			limit++;}
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++)
				System.out.print(a[i][j]);
			System.out.println();}
	}

}
