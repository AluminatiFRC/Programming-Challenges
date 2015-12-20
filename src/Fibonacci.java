
public class Fibonacci {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		System.out.println("Testing Fibonacci");
		int result;
		
		result = fibonacci(5);
		System.out.println("Expecting 8 got: " + result);
		result = fibonacci(8);
		System.out.println("Expecting 34 got: " + result);
		result = fibonacci(0);
		System.out.println("Expecting 1 got: " + result);
	}
	
	
	//Complete the following methods
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Returns the nth number in the fibonacci sequence. 
	 * 
	 * For example, given the argument 5, the function returns 8. Given the number
	 * 8 the function returns 34.
	 * <pre>
	 * Index:    0, 1, 2, 3, 4, 5,  6,  7,  8...
	 * Sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34...
	 * </pre>
	 */
	public int fibonacci(int n){
		return 0;
	}
}
