package Array;
public class SingleLoopArrayComp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int n=a.length;
		int j=1;
		for(int i=0;i<n;j++) {
			if(j<n) {
				if(a[i]<a[j]) {
					System.out.print(a[j]);}
			}
			if(j==n-1) {
				i++;
				j=1;}
		}
	}
}
