package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
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