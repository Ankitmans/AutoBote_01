package anki;

import java.util.jar.Attributes.Name;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,50,30,60,80,90,100};
		int swap;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
			System.out.println(a[i]);
		}
		

	}

}
