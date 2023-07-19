package anki;

public class Each_Rev {
	public static void main(String arg[]) {
		String name="Never Give Up";
		String [] word=name.split(" ");
		String rev= "";
		for(String s:word) {
			String revword=" ";
			for(int i=s.length()-1; i>=0; i--) {
				revword=revword+s.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);
	}

}
