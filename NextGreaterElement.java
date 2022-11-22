package Arrays;

public class NextGreaterElement {
	public static void main(String[]args) {
		int array[]= {2,3,7,-1,8,5,11};
		int n=array.length;
		Ascendingorder(array,n);
		int next,i,j;
		for(i=0;i<n-1;i++) {
			next=-1;
			for(j=1;j<n;j++) {
				if(array[i]<array[j]) {
					next=array[j];
					break;}
				}
			System.out.println(array[i]+">"+next);
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
