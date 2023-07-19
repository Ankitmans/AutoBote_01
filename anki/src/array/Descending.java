package array;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,60,90,70,80};
		int swap;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
				
			}
			System.out.println(arr[i]);
		}

	}

}
