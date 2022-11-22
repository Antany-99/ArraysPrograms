package Arrays;
import java.util.*;
public class Chance {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		int a[]={1, 9, 8, 4, 7, 7, 2, 0, 7, 6, 7};
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=7) {
				al.add(a[i]);}
			else {
				count++;}
		}
		for(int i=0;i<count;i++) {
			al.add(7);
		}
		System.out.println(al.toString());
	}

}
