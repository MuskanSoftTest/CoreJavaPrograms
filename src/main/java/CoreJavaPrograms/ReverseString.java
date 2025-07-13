package CoreJavaPrograms;

public class ReverseString {

//	Reverse a String without using reverse()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Muskan";
		String reversed = "";
		
		for(int i = str.length() -1; i>=0; i--) {
			reversed = reversed + str.charAt(i);								
		}
		
		System.out.println("Actual String : " + str + "\nReversed String : " +reversed);

	}

}
