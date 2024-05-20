package Assignments;

import java.util.Scanner;


// //   (((((x1*x2)+x3)-x4)+x5)/x6)

public class ScannerClass {

	public static int Multiplication(int num1, int num2) {
		return num1*num2;	
	}
	
	public static int Addition(int num1, int num2) {
		return num1+num2;	
	}
	
	public static int Substarction(int num1, int num2) {
		return num1-num2;	
	}
	
	public static int Division(int num1, int num2) {
		return num1/num2;	
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of x1");
		int x1= s.nextInt();
		System.out.println("Enter value of x2");
		int x2= s.nextInt();
		int multiplicationResult= Multiplication(x1,x2);
		System.out.println("Enter value of x3");
		int x3= s.nextInt();
		int additionResult= Addition(multiplicationResult,x3);
		System.out.println("Enter value of x4");
		int x4= s.nextInt();
		int substarctionResult= Substarction(additionResult,x4);
		System.out.println("Enter value of x5");
		int x5= s.nextInt();
		int additionResultnew= Addition(substarctionResult,x5);
		System.out.println("Enter value of x6");
		int x6= s.nextInt();
		int finalOutput= Division(additionResultnew,x6);
		System.out.println("Final Output is:" + finalOutput);
		

	}

}
