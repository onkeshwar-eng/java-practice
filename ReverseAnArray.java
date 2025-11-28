package coading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"Red","Green","Orange","Blue","Yellow"};
		System.out.println("Original Array: "+Arrays.toString(colors));
		
		//using collections class method
//		Collections.reverse(Arrays.asList(colors));
//		System.out.println("Reversed Array :"+Arrays.toString(colors));
		
		ArrayList<String> colorRev = new ArrayList<String>();
		for(int i=colors.length-1;i>=0;i--) {
			//System.out.println(colors[i]);
			colorRev.add(colors[i]);
		}
		System.out.println(colorRev);
	}
}
