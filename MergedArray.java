package Arrays;

import java.util.*;

public class MergedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0}; 
		int m = 3, n=3;
		int[] nums2 = {2,5,6};
		merge(nums1,m,nums2,n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            if(nums1[i]!=0){
                al.add(nums1[i]);}
        }
        for(int j=0;j<n;j++) {
        	al.add(nums2[j]);
        }
       Collections.sort(al);
        System.out.println(al);
    }

}
