package Assignments;

//If variable is declare as static then it will always print the last assigned/updated value
// even you use any object to call that method

public class Class3ConstructorExample2 {
	
static int value;
    
    // Default Constructor
    public Class3ConstructorExample2() {
        // Initialization code
    }
    
    // Parameterized Constructor
    public Class3ConstructorExample2(int val) {
        this.value = val;
    }
    
    // Another Parameterized Constructor
    public Class3ConstructorExample2(int val1, int val2) {
        this.value = val1 + val2;
    }


	public static void main(String[] args) {
		Class3ConstructorExample2 con = new Class3ConstructorExample2();
		Class3ConstructorExample2 con1 = new Class3ConstructorExample2(5);
		Class3ConstructorExample2 con2 = new Class3ConstructorExample2(5,5);
		System.out.println("Final Value: "+ value);
		System.out.println("Final Value: "+ con.value);
		System.out.println("Final Value: "+ con1.value);
		

	}

}
