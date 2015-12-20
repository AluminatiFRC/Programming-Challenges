
public class Prime {
	/**
	 * Run tests on the method we wrote.
	 */
	public void test(){
		//It's a good idea to add more tests.
		//Feel free to change the way the tests are performed.
		boolean result;
		
		result = isPrime(4);
		System.out.println("Expecting false got: " + result);
		result = isPrime(7);
		System.out.println("Expecting true got: " + result);
		result = isPrime(-7);
		System.out.println("Expecting false got: " + result);
		result = isPrime(1);
		System.out.println("Expecting false got: " + result);
		result = isPrime(2147483647);
		System.out.println("Expecting true got: " + result);
	}
	
	
	//Complete the following method
	//I've given them a value to return by default, it will need to change.
	
	/**
	 * Tests if a given integer is prime. A prime number is one that may only be
	 * divided evenly by one and itself. One is not a prime number. Negative 
	 * numbers cannot be prime.
	 */
	public boolean isPrime(int number){
		return false;
	}
}
