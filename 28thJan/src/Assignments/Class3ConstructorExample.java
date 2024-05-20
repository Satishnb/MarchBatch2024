package Assignments;

// once you call, it will print the value acc to ref variable you are using during the call
// if you declare the variable as static and public then it will print the last updated value

public class Class3ConstructorExample {
	
private int value;
    
    // Default Constructor
    public Class3ConstructorExample() {
        // Initialization code
    }
    
    // Parameterized Constructor
    public Class3ConstructorExample(int val) {
        this.value = val;
    }
    
    // Another Parameterized Constructor
    public Class3ConstructorExample(int val1, int val2) {
        this.value = val1 + val2;
    }


	public static void main(String[] args) {
		Class3ConstructorExample con = new Class3ConstructorExample();
		Class3ConstructorExample con1 = new Class3ConstructorExample(5);
		Class3ConstructorExample con2 = new Class3ConstructorExample(5,5);
		System.out.println("Final Value: "+ con.value);
		System.out.println("Final Value: "+ con1.value);
		System.out.println("Final Value: "+ con2.value);

	}

}
