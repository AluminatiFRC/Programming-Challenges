
public class ArraySum {
	/**
	 * Run tests on the method we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		System.out.println("Testing ArraySum");
		int result;
		
		result = sumArray(new int[] {1,2});
		System.out.println("Expecting 3 got: " + result);
		
		result = sumArray(new int[] {1,2,3,4,5,6,7,8,9});
		System.out.println("Expecting 45 got: " + result);

		result = sumArray(new int[] {4,4,-9});
		System.out.println("Expecting -1 got: " + result);
		
		result = sumArray(new int[] {});
		System.out.println("Expecting 0 got: " + result);
	}
	
	
	//Complete the following method
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Computes the sum of all values in the array. Empty arrays sum to 0.
	 */
	public int sumArray(int[] array){
		return 0;
	}
}
