/**
 * 		arrrays
 *
 * 			Methods for dealing with arrays
 *
 * 		Colin Quick
 */

public class arrays {
	

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6};

		System.out.println(avg(nums));
		
	}
	/**
	 * avg
	 * 		finds the mean of an array
	 *
	 * @param nums - the array of integers
	 * @return the mean
	 */
	public static double avg (int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			counter = counter + nums[i];
		}

		return ( (double) sum(nums)) / nums.length;

	}
	/**
	 * sum
	 * 		finds the sum of an array
	 *
	 * @param nums - an array of integers
	 * @return the sum
	 */
	public static int sum(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			counter = counter + nums[i];
		}
		return counter;
	}


}