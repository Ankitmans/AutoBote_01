package anki;

public class Vowels1 {
	public static void main(String []args) {
		String name="Ankit";
		String lower=name.toLowerCase();
		int count=0;
		int count2=0;
		int count3=0;
		char c;
		for(int i=0; i<name.length(); i++) {
			c=lower.charAt(i);
			if(c=='a') {
				count++;
			}
			else if(c=='e') {
				count2++;
			}
			else if(c=='i') {
				count3++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
	}

}
