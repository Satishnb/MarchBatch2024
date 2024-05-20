package Assignments;

public class TypeConversion {

	public static void ImplicitConversion(int num1, int num2)
	{
		int result= num1/num2;
		System.out.println(result);
	}
	
	public static void ExplicitConversion(int num1, float num2)
	{
		int result = (int) (num1/num2);
		System.out.println(result);
	}
	public static void main(String[] args) {
		ImplicitConversion(10,2);
		ExplicitConversion(10,2.0f);
	}

}
