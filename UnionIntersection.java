package Array;
import java.util.*;
public class UnionIntersection {
	public static void main(String args[]) {
		int a[]= {1,2,5,6,2,3,5,7,3};
		int b[]= {2,4,5,6,8,9,4,6,5,4};
		int n=a.length;
		int m=b.length;
		getUnion(a, n, b, m);
		getIntersection(a,n,b,m);
	}
	static void getUnion(int a[], int n, int b[], int m)
	{
		HashSet<Integer> s = new HashSet<>();
		for(int i=0;i<n;i++) {
			s.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			s.add(b[i]);
		}
		System.out.println("No. of Elements in Union"+" "+s.size());
		System.out.print(s.toString()+" ");
		System.out.println();
	}
    static void getIntersection(int a[], int n, int b[], int m){
         HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++)
            hs.add(a[i]);
 
        for (int i = 0; i < m; i++)
            if (hs.contains(b[i]))
                System.out.print(b[i] + " ");
    }
}
