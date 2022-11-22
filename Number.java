package Arrays;

public class Number {
	public static void main(String args[]) {
		int n=15,count,r,x=3,y=4;
		for(int i=1;n!=0;i++) {
			int a=i;
			count=0;
			while(a>0) {
				r=a%10;
				a=a/10;
				count++;
				if(r==x ||r==y) {
					count--;
				}
			}
			if(count==0) {
				System.out.print(" "+i);
				n--;
			}
		}
	}
}
