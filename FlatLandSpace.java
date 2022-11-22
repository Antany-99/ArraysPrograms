package Arrays;

import java.util.*;

public class FlatLandSpace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int c[] = new int[m];
        for(int i=0; i < m; i++){
            c[i] = s.nextInt();
        }
        Arrays.sort(c);
        int max = c[0];
        for (int i = 1; i < c.length; ++i) {
            int diff = c[i] - c[i - 1];
            int length = diff / 2;
            max = Math.max(max, length);
        }
        max = Math.max(max, n - c[c.length - 1] - 1);
        System.out.println(max);

	}

}
