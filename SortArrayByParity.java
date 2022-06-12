import java.util.Arrays;

class SortArrayByParity {
	public static int[] sortByParity(int[] nums) {
		int fp = 0;
        int sp = fp + 1;
        
        while(sp < nums.length) {
            if (nums[fp] % 2 != 0 && nums[sp] % 2 == 0) {
                int temp = nums[sp];
				nums[sp] = nums[fp];
				nums[fp] = temp;
				
				fp++;
				sp++;
            } else if (nums[fp] % 2 == 0) {
				fp++;
				sp++;
			} else {
				sp++;
			}
        }
		
		return nums;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,2,4}; 
		
		System.out.println(Arrays.toString(sortByParity(arr)));
	}
}