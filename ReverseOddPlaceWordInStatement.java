package coading;

public class ReverseOddPlaceWordInStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Travel is my pasion";
	        String output ="Travel si my noisap";
	        String[] arr = input.split(" ");
	        for(int i=0;i<arr.length;i++){
	            if(i%2==0){
	                System.out.print(arr[i]+" ");
	            }else{
	                System.out.print(reverseString(arr[i])+" ");
	            }
	        }

	}
	public static String reverseString(String val){
        StringBuffer sb = new StringBuffer(val);
        return sb.reverse().toString();
    }
}
