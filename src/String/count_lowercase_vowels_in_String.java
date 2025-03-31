package String;

public class count_lowercase_vowels_in_String {
	public static int countlowerVowels(String str) {
		int vowelCount = 0;
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		String str = "anonomous";
		System.out.print(countlowerVowels(str));
	}

}
