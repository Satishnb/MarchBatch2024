package Assignments;

public class Class3constructorCallUsingThisKeyword {
	
	
public Class3constructorCallUsingThisKeyword() {
	 this(1,2,3);
	 System.out.println("I am default constructor");
}
public Class3constructorCallUsingThisKeyword(int a) {
	  this(1,2,3,4);
	 System.out.println("I am One parameterized constructor");	
}
public Class3constructorCallUsingThisKeyword(int a, int b) {
	 this(1);
	 System.out.println("I am Two parameterized constructor");
}
public Class3constructorCallUsingThisKeyword(int a, int b, int c) {
	 System.out.println("I am Three parameterized constructor");	
}
public Class3constructorCallUsingThisKeyword(int a, int b, int c, int d) {
	 this();
	 System.out.println("I am Four parameterized constructor");	
}
	public static void main(String[] args) {
		
		Class3constructorCallUsingThisKeyword call = new Class3constructorCallUsingThisKeyword(1,2);
	
	}
}

