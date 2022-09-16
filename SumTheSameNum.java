package Array;

public class SumTheSameNum {
	public static void main(String args[]) {
		int [] arr = {0, 2, 2, 2, 6, 6, 0, 8, 0};
		int len = arr.length;	
		int sum,count=0;
		for(int i=0;i<len;i++) {	
			if((arr[i]!=0)&&(arr[i]==arr[i+1])) {		
				sum=arr[i]+arr[i+1];
				arr[count++]=sum;
				i++;}
			else if((arr[i]!=0)&&(arr[i]!=arr[i+1])){
				sum=arr[i];
				arr[count++]=sum;}
		}
			while(count<len) {
				arr[count++]=0;}
			for(int j=0;j<len;j++) {
				System.out.print(arr[j]+" ");}
		}	
}
