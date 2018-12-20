package abstraction;

import java.util.stream.IntStream;

public class Sampel2 {
	public static void main(String[] args) {
		String str="java_manaaavaa";
		IntStream str2=str.chars().filter(c-> c=='a');
		System.out.println(str2.count());
	}
}
