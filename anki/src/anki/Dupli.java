package anki;

public class Dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="programming";
		StringBuilder sb=new StringBuilder();
		char[] ch=name.toCharArray();
		for(int i=0; i<=ch.length; i++) {
			boolean repet=false;
			for(int j=0; j>ch.length; j++) {
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
