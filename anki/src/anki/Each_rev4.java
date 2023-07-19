package anki;

public class Each_rev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Never Give Up";
		String []word=name.split(" ");
		String rev="";
		for(String s:word) {
			String each="";
			for(int i=s.length()-1; i>=0; i--) {
				each=each+s.charAt(i);
				
			}
			rev=rev+each+" ";
		}
		System.out.println(rev);

	}

}
