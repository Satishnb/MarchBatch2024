package Assignments;

public class Class1ClassMethodObjectConcept {
	int age;
	int rollNumber;
	
	public static void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public static void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1ClassMethodObjectConcept refVar = new Class1ClassMethodObjectConcept();
		refVar.display1();
		refVar.display2();
		refVar.age= 23;
		refVar.rollNumber= 10;
		
		System.out.println("Student's Roll Number is:" + refVar.rollNumber);
		System.out.println("Student's Age is:" + refVar.age);

	}

}
