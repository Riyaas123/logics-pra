package logics;

public class conversionof2chararray {
	public static void main(String[] args) {
		String str = "java";
		char[] ch = str.toCharArray();
		int j = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
