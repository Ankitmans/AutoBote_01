package anki;

public class Arr {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,80,70,90,100};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

}
}
