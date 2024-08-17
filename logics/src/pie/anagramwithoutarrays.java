package pie;

public class anagramwithoutarrays {
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "gramana";
		int[] arr = new int[123];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			arr[ch]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println("not a anagram");
			}

		}
		System.out.println("string is anagram");
	}
}