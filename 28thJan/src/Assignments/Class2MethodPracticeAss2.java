package Assignments;

//   (((((10*2)+2)-2)*2)/2)

public class Class2MethodPracticeAss2 {
	
	public static int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public static int addition(int num1, int num2) {
		return num1+num2;	
	}
	
	public static int substraction(int num1, int num2) {
		return num1-num2;
	}
	
	public static void division(int num1, int num2) {
		System.out.println("final output is: " + num1/num2);
	}
	
	public static void main(String[] args) {
		Class2MethodPracticeAss2 output= new Class2MethodPracticeAss2();
		int multiplicationOutput= output.multiplication(10, 2);
		int additionOutput= output.addition(multiplicationOutput,2);
		int substarctionOutput= output.substraction(additionOutput, 2);
		int multiplicationOutputNew= output.multiplication(substarctionOutput, 2);
		output.division(multiplicationOutputNew, 2);
		
		
		
		
		
		

	}

}
