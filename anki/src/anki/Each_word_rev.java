package anki;

public class Each_word_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hg irg  jv gjf ";
		int count=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

}
}
