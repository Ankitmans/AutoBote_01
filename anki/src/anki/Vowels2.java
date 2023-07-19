package anki;

public class Vowels2 {
	public static void main(String args[]) {
		String name="ankit";
		String lower=name.toLowerCase();
		int count=0;
		char c;
		for(int i=0; i<name.length(); i++) {
			c=lower.charAt(i);
			if(c=='a'|| c=='e' ||c=='i' ||c=='o'|| c=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
