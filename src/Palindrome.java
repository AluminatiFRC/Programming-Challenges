
public class Palindrome {
	/**
	 * Run tests on the method we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		boolean result;
		
		result = isPalendrome("racecar");
		System.out.println("Expecting true got: " + result);
		result = isPalendrome("anna");
		System.out.println("Expecting true got: " + result);
		result = isPalendrome("robotics");
		System.out.println("Expecting false got: " + result);
	}	
	
	//Complete the following method
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Tests if the given string is a palindrome. A palindrome is a word that
	 * is spelled the same forwards and backwards, such as "racecar" or "anna".
	 * This function only accounts for strings that are entirely lowercase 
	 * letters.
	 */
	public static boolean isPalendrome(String word){
		return false;
	}
}
