package anki;

public class Vowels3 {
	public static void main(String args[]) {
		String name="Ankit";
		String lower=name.toLowerCase();
		char c;
		int count=0;
		for(int i=0; i<lower.length(); i++) {
			c=lower.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
