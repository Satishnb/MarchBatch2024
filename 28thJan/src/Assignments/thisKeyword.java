package Assignments;

public class thisKeyword {
	
	int num=10;
	
	public void method1(int a) {
		num=a;
		System.out.println("Method1, Global One: " + num);
		
	}
	
    public void method2(int num) {
    	num=num;
    	System.out.println("Method2, Local One: "+ num);
		
	}
    
    public void method3(int num) {
    	System.out.println("Method3, local one: "+ num);
    	this.num=num;
    	System.out.println("Method3, Refer to Global One: "+ num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeyword obj = new thisKeyword();
		System.out.println("global variable before calling method:" + obj.num);
		obj.method1(55);
		obj.method2(22);
		System.out.println("global variable:" + obj.num);
		obj.method3(33);
		
		

	}

}
