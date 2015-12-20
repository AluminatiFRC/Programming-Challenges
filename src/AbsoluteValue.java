public class AbsoluteValue {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		int result;
		
		result = abs(42);
		System.out.println("Expecting 42 got: " + result);
		result = abs(-42);
		System.out.println("Expecting 42 got: " + result);
		result = abs(0);
		System.out.println("Expecting 0 got: " + result);
	}
	
	
	//Complete the following method
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Returns the absolute value of the number given. The return value should never
	 * be negative.
	 */
	public int abs(int number){
		return 0;
	}
}
