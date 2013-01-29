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

		System.out.println(numThrees(nums));
		
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
	/**
	 * numThrees
	 * 		finds the number of 3's in an array
	 *
	 * @param nums - an array of ints
	 * @return the number of threes
	 */
	public static int numThrees(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				counter = counter + 1;
			}
		}
		return counter;
	}


}