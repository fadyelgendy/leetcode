class CheckIfNExists {
	
	public static boolean isExists(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == 2 * nums[i] || nums[i] == 2 * nums[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,2,5,1};
		System.out.println(isExists(arr));
	}
}