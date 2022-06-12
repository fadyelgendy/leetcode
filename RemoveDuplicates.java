import java.util.Arrays;

class RemoveDuplicates {
	
	public static int removeDuplicate(int[] nums)
	{
		int firstPointer = 0;
		int secondPointer = firstPointer + 1;
		
		while(secondPointer < nums.length) {
			if (nums[firstPointer] == nums[secondPointer]) {
				secondPointer++;
			} else {
				firstPointer++;
				nums[firstPointer] = nums[secondPointer];
				secondPointer++;
			}
		}
		
		return firstPointer + 1;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,1,1,1,2,2,3,3,4};
		
		int result = removeDuplicate(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}
}