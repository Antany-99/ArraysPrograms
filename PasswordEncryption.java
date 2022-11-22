package Arrays;
import java.util.*;
public class PasswordEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list=new ArrayList<>();
		String s1="TalkingTom123";
		char s[]=s1.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(s[i]==97 || s[i]==65) {
				list.add((char) (s[i]+25));}
			else if(s[i]>97 || s[i]<123) {
				list.add((char) (s[i]-1));}
			
		}
		for(char c: list) {
			System.out.print(c);
		}
	}

}
