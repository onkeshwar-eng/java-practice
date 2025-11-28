package coading;

public class SwappingTwoVariableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping values-"+"a:"+a+", b:"+b);

	}

}
