package abstraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class MainSortEmployee {
	public static void main(String[] args) {
		TreeSet list = new TreeSet(new SortById());
		list.add(new SortEmployee(10, "arm"));
		list.add(new SortEmployee(50, "brm"));
		list.add(new SortEmployee(30, "drm"));
		list.add(new SortEmployee(40, "crm"));
		
		for(Object obj:list)
			System.out.println(obj);
		
	}
}
