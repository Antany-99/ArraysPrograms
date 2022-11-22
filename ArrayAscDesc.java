package Arrays;
import java.util.*;
public class ArrayAscDesc {
	public static void main(String[] args) {
		List<Integer> b=new ArrayList<>();
		List<Integer> c=new ArrayList<>();
		int a[]= {13,2,4,15,12,10,5};
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				b.add(a[i]);}
			else {
				c.add(a[i]);}
		}
		Collections.sort(b);
		Collections.sort(c);
		int d=b.size();
		int e=-1;
		for(int j=0;j<n;j++) {
			if(j%2==0) {
				System.out.print(b.get(--d));
			}
			else {
				System.out.print(c.get(++e));
			}
		}
	}

}
