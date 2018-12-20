package abstraction;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Sample {
	public static void main(String[] args) {
		String str="Himalaya";
		LinkedHashSet set = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			set.add(str.charAt(i));
		}
		System.out.println(set);
	}
}
