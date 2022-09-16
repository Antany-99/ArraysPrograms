package Array;
public class LargeSumContiguesArray {
	    public static void main(String args[]) {
	        int a[] = {1, 3, 8, -2, 6, -8, 5};
	        int n = a.length;
	        int maxSum = Integer.MIN_VALUE;
	        for (int i = 0; i <= n - 1; i++) {
	            int currSum = 0;
	            for (int j = i; j <= n - 1; j++) {
	                currSum += a[j];
	                if (currSum > maxSum) {
	                    maxSum = currSum;}
	            }
	        }
	        System.out.println(maxSum);}
	
}
