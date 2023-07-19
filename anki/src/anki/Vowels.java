package anki;

public class Vowels {
	public static void main(String args[]) {
		String name="Ankit";
		String lower=name.toLowerCase();
		char c;
		int count=0;
		for(int i=0; i<name.length(); i++) {
			c=lower.charAt(i);
			if(c=='a'|| c=='u' || c=='e' || c=='i' || c=='o') {
				count++;
			}
		}
		System.out.println("Number of Vowels ="+count);
	}

}
