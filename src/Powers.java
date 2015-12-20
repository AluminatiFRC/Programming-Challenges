
public class Powers {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		System.out.println("Testing Powers");
		int result;
		
		result = pow(2, 4);
		System.out.println("Expecting 16 got: " + result);
		result = pow(4, 2);
		System.out.println("Expecting 16 got: " + result);
		result = pow(3, 5);
		System.out.println("Expecting 243 got: " + result);
		result = pow(3, -5);
		System.out.println("Expecting 0 got: " + result);
	}	
	
	//Complete the following methods
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Returns the base raised to the integer power of the exponent. If the exponent 
	 * argument is negative, the result willbe 0.
	 */
	public int pow(int base, int exponent){
		return 0;
	}
}
