package array;

public class Desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in= {10,20,30,50,80,70};
		int swap;
		for(int i=0; i<in.length; i++) {
			for(int j=i+1; j<in.length; j++) {
				if(in[i]<in[j]) {
					swap=in[i];
					in[i]=in[j];
					in[j]=swap;		
				}
				
			}
			System.out.println(in[i]);
		}

	}

}
