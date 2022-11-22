package Arrays;
public class XPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr="PROGRAM";
		char a[]=arr.toCharArray();
		int n=a.length;
		if(n%2!=0) {
			for(int i=0;i<n;i++) {
				int j=n-1-i;
				for(int k=0;k<n;k++) {
					if((k==i)||(k==j)) {
						System.out.print(a[k]);}
					else {
						System.out.print(" ");}}
				System.out.println(" ");}
		}
		else {
			System.out.println("0");
		}
	}

}
