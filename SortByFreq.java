package Arrays;

import java.util.*;

public class SortByFreq {
	public static void main(String[] args) {
		
		int[] a ={2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		int val=0, index=0;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		List<Integer> key = new ArrayList<>();
		List<Integer> value = new ArrayList<>();
		for(int x : a) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
        key.addAll(map.keySet());
        value.addAll(map.values());
        for(int i=0; i<map.size(); i++) {
        	val=Collections.max(value);
        	index=value.indexOf(val);
        	for(int j=0; j<val; j++) {
        		System.out.print(key.get(index));
        	}
        	value.set(index, 0);
        }
	}
}
