package coading;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,0,3,-1,5,5,10};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i :arr) {
			System.out.println(i);
		}
	}

}
