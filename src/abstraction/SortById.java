package abstraction;

import java.util.Comparator;

public class SortById implements Comparator<SortEmployee>{

	@Override
	public int compare(SortEmployee o1, SortEmployee o2) {
		SortEmployee emp1 = o1;
		SortEmployee emp2 = o2;
		return emp1.id-emp2.id;
	}
	
}
