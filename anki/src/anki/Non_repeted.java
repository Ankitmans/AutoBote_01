package anki;

public class Non_repeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="programming";
		StringBuilder sb=new StringBuilder();
		char[] arr=name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			boolean repet=false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					repet=true;
					break;
				}
			}
			if(!repet) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
				

	}
	

}
