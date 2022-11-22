package Arrays;

public class MissingArrayNumber {
	public static void main(String[] args) {
		int num[] = { 2, 3, 4, 7 };
		int j = 0;
		for (int i = num[0]; i < num[num.length - 1]; i++) {
			if ( i == num[j]) {
				j++;
				continue;}
			else {
				System.out.println(i);
				break;}
		}
	}
	

}
