package Arrays;

import java.util.Scanner;

public class SubArrayDivision {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=5;
	        int[] a= {1,2,1,3,2};
	        int d=3,m=2,res=0;
	        for(int i=0;i+m-1<n;i++){
	            int sum=0;
	            for(int j=i;j<i+m;j++){
	                sum+=a[j];}
	            if(sum==d){
	                res++;}
	        }       
	        System.out.println(res);
	}

}
