package Assignments;

public class Class1ClassMethodObjectConcept1 {
	
	// we can access static var without using ref variable
	// we can't access var without using ref variable

	 static int age;
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
		
		// we can access static var without using ref variable

		int marks;
		Class1ClassMethodObjectConcept1 refVar = new Class1ClassMethodObjectConcept1();
		refVar.display1();
		refVar.display2();
		age= 23;
		refVar.rollNumber= 10;
		marks=22;
		
		// we can't access var without using ref variable
		System.out.println("Student's Roll Number is:" + refVar.rollNumber);
		// we can access static var without using ref variable
		System.out.println("Student's Age is:" + age);
		
		// local variable we can use without the ref var
		System.out.println("Student's mark is:" + marks);

	}

}
