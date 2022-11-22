package Arrays;

public class ChristmasTreePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=n*n,b=n/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<a-i;j++) {
				System.out.print(" ");}
			for(int k=0;k<=i;k++) {
				System.out.print("*"+" ");}
			System.out.println();}
		for(int i=0;i<n;i++) {
			for(int j=a-i;j>=n;j--) {
				System.out.print(" ");}
			for(int k=(n*2)+i;k>n;k--) {
				System.out.print("*"+" ");}
			System.out.println();}
		for(int i=0;i<n;i++) {
			for(int j=0;j<a-1;j++) {
				System.out.print(" ");}
			for(int k=0;k<b;k++) {
				System.out.print("*"+" ");
			System.out.print(" ");}
			System.out.println();}
	}
}