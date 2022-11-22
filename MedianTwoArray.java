package Arrays;

public class MedianTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2};
			int b[]= {3};
	System.out.println(findMedianSortedArrays(a,b));
	}
	public static double findMedianSortedArrays(int[] a, int[] b) {
	    int c[]=new int[a.length+b.length];
	    int i=0,j=0,k=0;
	    while(i<a.length && j<b.length) {
	        if(a[i]<b[j]) {
	            c[k++] = a[i++];
	        }
	        else {
	            c[k++] = b[j++];
	        }
	    }
	    int n=a.length+b.length;
	    if(n%2==1) {
	        return c[((n+1)/2)-1];}
	    else 
	        return ((double)c[(n/2)-1]+(double)c[(n/2)])/2.0;
	}
}