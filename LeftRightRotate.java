package Array;
public class LeftRightRotate {
	public static void main(String[] args) {
		int n=2;
		int a[]= {1,2,3,4,5};
		System.out.print("Left Rotation"+" ");
		for(int i=n;i<a.length;i++) {
			System.out.print(a[i]+" ");}
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");}
		System.out.println();
		System.out.print("Right Rotation"+" ");
		for(int i=a.length-n;i<a.length;i++) {
			System.out.print(a[i]+" ");}
		for(int j=0;j<a.length-n;j++) {
			System.out.print(a[j]+" ");}
	}
}
