import java.util.Arrays;

class RemoveElements {
	
	public static int remove(int[] nums, int val) {
		int counter = 0;
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end) {
			if (nums[start] == val) {
				if (nums[end] != val) {
					int temp = nums[end];
					nums[end] = nums[start];
					nums[start] = temp;
				} else {
					end--;
				}
			} else {
				start++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (val == nums[i]) counter++;
		}
		
		return nums.length - counter;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,0,4,2};
		
		int result = remove(arr, 2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}
}