package anki;

public class Duplicate3 {
	public static void main(String []args) {
		String name="programing";
		StringBuilder str=new StringBuilder();
		char[] ch=name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			boolean repet=false;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					repet=true;
					break;
				}
			}
			if(!repet) {
				str.append(ch[i]);
			}
		}
		System.out.println(str);
		
    }

}
