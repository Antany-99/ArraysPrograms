package Arrays;

import java.util.Scanner;

public class stringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s1="abc";
		String s2="bca";
		printPermute(s1,s2);
	}
	public static void printPermute(String str1,String str2) {
		if(str1.equals(str2)) {
			System.out.println("The first String is permutation to the other");
			return;
		}
		for (int i = 0; i < str2.length(); i++) {
	         String str = str2.substring(0, i) + str2.substring(i + 1);
	         printPermute(str1,str);
	     }
	}

}
