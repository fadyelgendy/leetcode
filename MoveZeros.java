import java.util.Arrays;

class MoveZeros {
	public static void moveZero(int[] nums) {
		int firstPointer = 0;
        int secondPointer = firstPointer + 1;
        
        while(secondPointer < nums.length) {
            if (nums[firstPointer] == 0 && nums[secondPointer] != 0) {
                int temp = nums[secondPointer];
                nums[secondPointer] = nums[firstPointer];
                nums[firstPointer] = temp;
                firstPointer++;
                secondPointer++;
            } else if (nums[firstPointer] != 0) {
				firstPointer++;
                secondPointer++;
			} else {
                secondPointer++;
            }
        }
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,4,0,0,3,0,5,1,0};
		moveZero(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}