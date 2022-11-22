package Arrays;

public class LongestPositiveInt {
	public static void main(String[]args) {
		int a[]= {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
		int n=a.length;
		int maxIdx=0,maxLen=0,currLen=0,currIdx=0;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				currLen++;
				if(currLen==1) {
					currIdx=i;}}
			else {
				if(currLen>maxLen) {
					maxLen=currLen;
					maxIdx=currIdx;}
				currLen=0;}
		}
		if(maxLen>0) {
			System.out.println("Length"+" "+maxLen);
			System.out.println("Starting Index"+" "+maxIdx);
			for(int i=maxIdx;i<maxIdx+maxLen;i++) {
				System.out.println(a[i]);}}
		else {
			System.out.println("No Positive Numbers");}
	}
}
