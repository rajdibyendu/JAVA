package abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Srt {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet();
		set.add(90);
		set.add(20);
		set.add(70);
		set.add(40);
		set.add(30);
		
		Collections.sort(set);
		System.out.println(set);
	}
}
