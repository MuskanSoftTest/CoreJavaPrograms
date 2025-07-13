package CoreJavaPrograms;

public class Palindrom {

//	A palindrome is a string that reads the same forwards and backwards, e.g. madam, 121, racecar.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "muskan";
		String reversed = "";
		
		for(int i= str.length() - 1; i>=0; i--) {
			reversed= reversed +  str.charAt(i);		
		}
		if(str.equals(reversed)) {
			System.out.println(str + ": word is palindrom");
		}
		else {
			System.out.println(str + ": word is not palindrom");
		}
	}

}
