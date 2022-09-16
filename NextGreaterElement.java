package Array;

public class NextGreaterElement {
	public static void main(String[]args) {
		int a[]= {2,3,7,-1,8,5,11};
		int n=a.length;
		Ascendingorder(a,n);
		int next,i,j;
		for(i=0;i<n-1;i++) {
			next=-1;
			for(j=1;j<n;j++) {
				if(a[i]>a[j]) {
					next=a[j];
					break;}
				}
			System.out.println(a[i]+">"+next);
			}
		}
	static  int Ascendingorder(int a[],int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;}
				}
			}
		return temp;
		}
}
