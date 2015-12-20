public class LongestString {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		System.out.println("Testing LongestString");
		String result;
		
		result = longestString("robots are cool","pizza");
		System.out.println("Expecting \"robots are cool\" got: " + result);
		result = longestString("robots are cool","soggy hamburger");
		System.out.println("Expecting \"robots are cool\" got: " + result);
	}
	
	
	//Complete the following method
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Return the longer of two input strings. If both strings are the same length,
	 * the first string (a) should be returned.
	 */
	public String longestString(String a, String b){
		return "";
	}
}
