package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(34);
		set.add(2);
		set.add(6);
		set.add(323);
		set.add(34);
		set.add(null);
		
		Iterator i=set.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
	}
}
