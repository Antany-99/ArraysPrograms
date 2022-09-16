package Array;

public class SortByFactor {
	public static void main(String[] args) {
		int a[]= {8, 2, 3, 12, 16};
		int n=a.length,i,j,c=0;
		int b[]=new int[n];
		for(i=0;i<n;i++){
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					c++;}
			}
			b[i]=c;
			c=0;}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++) {
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;}
			}
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");}
	}
}
