package Arrays;

public class Matrix90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[j][n-1-i]+" ");
			}
			System.out.println();
		}

	}

}
