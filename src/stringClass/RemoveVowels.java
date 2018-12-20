package stringClass;

public class RemoveVowels {
	public static void main(String[] args) {
		//method-1
		String str = "abcdefghijaeiounsjh rayd dhjswoiiutuuu";
		System.out.println(str.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", ""));
		
		//method-2
		String str2 = "abcdefghijklmnopueoioASESISOSUauueindfjdfoooii";
		System.out.println(str2.replaceAll("[aeiouAEIOU]", ""));
	}
}
