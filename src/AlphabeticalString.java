
public class AlphabeticalString {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		String result;
		
		result = alphabeticalString("apples","bannanas");
		System.out.println("Expecting apples got: " + result);
		result = alphabeticalString("bands","bannanas");
		System.out.println("Expecting bands got: " + result);
		result = alphabeticalString("aaa","bbb");
		System.out.println("Expecting aaa got: " + result);
		result = alphabeticalString("abba","abbb");
		System.out.println("Expecting abba got: " + result);
	}
	
	
	//Complete the following methods
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Returns whichever string comes first alphabetically. This method only
	 * accounts for strings of all lowercase letters.
	 */	
	//Hint: use char to complete this challenge. You will need to compare them
	//using > or <
	public static String alphabeticalString(String a, String b){
		return "";
	}
}
