package Assignments;

//   (((((10+2)+2)-2)*2)/2)

public class Class2MethodPracticeAss1 {
	
	public static int addition(int num1, int num2) {
		return num1+num2;	
	}
	
	public static int substraction(int num1, int num2) {
		return num1-num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public static void division(int num1, int num2) {
		System.out.println("final output is: " + num1/num2);
	}
	
	public static void main(String[] args) {
		Class2MethodPracticeAss1 output= new Class2MethodPracticeAss1();
		int additionOutput= output.addition(10,2);
		int additionOutputNew= output.addition(additionOutput, 2);
		int substarctionOutput= output.substraction(additionOutputNew, 2);
		int multiplicationOutput= output.multiplication(substarctionOutput, 2);
		output.division(multiplicationOutput, 2);
		
		
		
		
		
		

	}

}
