package Package28thJan;

public class Reverse {

	public static String ActtualOutput(String input) {
		String[] data= input.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=data.length-1; i>=0; i--) {
			sb.append(data[i]).append(" ");
			
		}
		 return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		String input= "Today is a beautiful day";
		Reverse obj= new Reverse();
		String output= obj.ActtualOutput(input);
		System.out.println(output);
		
		// TODO Auto-generated method stub

	}

}
