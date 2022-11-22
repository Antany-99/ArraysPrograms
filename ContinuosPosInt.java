package Arrays;
import java.util.*;
public class ContinuosPosInt {
	public static void main(String args[]) {
		int a[]= {1,3,10,7,9,12,2,8,4,6};
		int n=a.length;
		Arrays.sort(a);
		for(int i=1;i<n;i++) {
			if(a[i]==a[i-1]+1) {
				System.out.print(a[i-1]+" ");}
			else {
				System.out.print(a[i-1]+" ");
				System.out.println();}
		}
	}
}
