package anki;

public class Vowels4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String atr="Ankit";
		String lower=atr.toLowerCase();
		char ch;
		int count=0;
		for(int i=0; i<lower.length(); i++) {
			ch=lower.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
