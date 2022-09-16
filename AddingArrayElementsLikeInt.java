package Array;

public class AddingArrayElementsLikeInt {
	public static void main(String[]args) {
		int a[]= {8,5,4,56,65,10};
		int b[]= {4,9,24,35};
		String s1="";
		String s2="";
		for(int i=0;i<a.length;i++) {
			s1=s1+a[i];}
		for(int j=0;j<b.length;j++) {
			s2=s2+b[j];}
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		String s3=""+n3;
		for(int k=0;k<s3.length();k++) {
			System.out.print(s3.charAt(k));}
		}
}
