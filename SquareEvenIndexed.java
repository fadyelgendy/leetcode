import java.util.Arrays;

class SquareEvenIndexed {
	public static void square(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = nums[i] * nums[i];
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9, -2, -9, 11, 56, -12, -3};
		
		square(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}