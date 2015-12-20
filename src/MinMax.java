public class MinMax {
	/**
	 * Run tests on the methods we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		System.out.println("Testing MinMax");
		int result;
		
		result = min(1,4);
		System.out.println("Expecting 1, got: " + result);		
		result = min(4,1);
		System.out.println("Expecting 1, got: " + result);
		result = min(-4,1);
		System.out.println("Expecting -4, got: " + result);
		
		
		result = max(1,4);
		System.out.println("Expecting 4, got: " + result);		
		result = max(4,1);
		System.out.println("Expecting 4, got: " + result);
	}
	
	
	//Complete the following methods
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Returns the value of the lowest number given. This function also accounts
	 * for signs. 
	 * @param a The first number given
	 * @param b The second number given
	 * @return the minimum value between A and B
	 */
	public int min(int a, int b){
		return 0;
	}
	
	/**
	 * Returns the value of the largest number given. This function also accounts
	 * for signs. 
	 * @param a The first number given
	 * @param b The second number given
	 * @return the maximum value between A and B
	 */
	public int max(int a, int b){
		return 0;
	}
}
