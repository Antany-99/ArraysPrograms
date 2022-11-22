package Arrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int a[]= {16,17,4,3,5,2};
		int b[]={16,17,4,3,5,2};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]<a[j]) {
					b[i]=a[j];
					break;
				}
			}
			list.add(b[i]);
		}
		System.out.println(list);
	}
}