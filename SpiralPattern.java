package Arrays;

public class SpiralPattern {
	public static void main(String args[])  
	{  
	    int n=5;  
	    int i, j, N;  
	    int a[][] = new int[n][n];  
	    int left,top;  
	    left=0;  
	    top=n-1;  
	    N=1;  
	    for(i=1; i<=n/2;i++,left++,top--){  
	        for(j=left; j<=top; j++, N++){  
	            a[left][j]=N;   }  
	        for(j=left+1;j<=top;j++,N++){  
	            a[j][top]=N;   }  
	        for(j=top-1;j>=left;j--,N++){  
	            a[top][j]=N;   }   
	        for(j=top-1;j>=left+1;j--,N++){  
	            a[j][left]=N;   }  
	    }  
	    for(i=0;i<n;i++){  
	        for(j=0;j<n;j++){  
	            System.out.printf("%-5d",a[i][j]);}  
	    System.out.println();}  
	}  
	
}
