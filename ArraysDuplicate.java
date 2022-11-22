package Arrays;

import java.util.*;

public class ArraysDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		int a[]= {1,2,4,0,4,1,3,2};
		int n=a.length;
		int count=0,max=0,b=0;
		for(int i=0;i<n;i++) {
			if(set.add(a[i])) {
				count++;}
			else {
				if(count>max) {
					max=count;
					b=i;}
				count=0;
			}
		}
		System.out.println(a[b]);
	}

}
