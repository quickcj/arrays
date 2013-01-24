public class arrays {
	

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6}z;

		System.out.println(avg(nums));
		
	}
	public static double avg (int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			counter = counter + nums[i];
		}

		return ( (double) counter) / nums.length;

	}


}