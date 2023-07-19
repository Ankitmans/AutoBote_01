package array;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,50,80,90,70,100};
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		}

}
