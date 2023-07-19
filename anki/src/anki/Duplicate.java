package anki;



public class Duplicate {
	public static void main(String args[]) {
		String str="Ankit";
		char [] ar=str.toCharArray();
		StringBuilder str1=new StringBuilder();
		for(int i=0; i<ar.length; i++) {
			boolean repet=false;
			for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				repet=true;
				break;
			}
			}
			if(!repet) {
				str1.append(ar[i]);
			}
		}
		System.out.println(str1);
	}
	
	
	
	
	
}
