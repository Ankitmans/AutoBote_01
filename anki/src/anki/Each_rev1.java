package anki;

public class Each_rev1 {

	public static void main(String[] args) {
		String name="Never Give Up";
		String[] arr=name.split(" ");
		String rev="";
		for(String word:arr) {
			String each_word="";
			for(int i=word.length()-1; i>=0; i--) {
				each_word=each_word+word.charAt(i);
			}
			rev=rev+each_word+" ";
			}
		System.out.println(rev);
		
	}

}
