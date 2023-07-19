package anki;

public class Duplicate2 {

	public static void main(String[] args) {
		
		String name="Programing";
		char[] ch=name.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<ch.length; i++) {
			boolean repet=false;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					repet=true;
					break;
				}
			}
			if(!repet) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);

	}

}
