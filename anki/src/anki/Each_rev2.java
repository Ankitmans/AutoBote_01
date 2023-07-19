package anki;

public class Each_rev2 {
	public static void main(String args[]) {
		String name="Never Give Up";
		String [] word=name.split(" ");
		String rev="";
		for(String s:word) {
			String each_word="";
			for(int i=s.length()-1; i>=0; i--) {
				each_word=each_word+s.charAt(i);
			}
			rev=rev+each_word+" ";
		}
		System.out.println(rev);
	}

}
