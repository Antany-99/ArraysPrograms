package Arrays;

public class CurrencyNoteArray {
	public static void main(String[] args) {
		int a=7747;
		int n[]= {2000,500,200,100,50,20,10,5,2,1};
		int c[]=new int[10];
		for(int i=0;i<10;i++) {
			if(a>=n[i]) {
				c[i]=a/n[i];
				a-=c[i]*n[i];}
		}
		for(int i=0;i<10;i++) {
			if(c[i]!=0) {
				System.out.println(n[i]+" "+c[i]);	}
		}
		
	}
}
