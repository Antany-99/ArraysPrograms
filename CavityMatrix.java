package Arrays;

import java.util.Scanner;

public class CavityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=6;
            int c=2;
            int m=2;
            int b=n/c,d=0,e=b,f=0;
            while((b>=m)){
                f=b/m;
                d=b%m;
                e=e+f;
                b=f+d;
            }
            System.out.println(e);
     }

}
