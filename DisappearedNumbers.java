import java.util.*;
import java.lang.Math;

class DisappearedNumbers {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int bound = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < bound; i++) {
			int current = Math.abs(nums[i]);
			nums[current - 1] = - Math.abs(nums[current - 1]);
		}
		
		for (int i = 1; i <= nums.length; i++) {
			if (nums[i - 1] > 0) {
				list.add(i);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		
		List<Integer> list = findDisappearedNumbers(arr);
		
		System.out.println(Arrays.toString(list.toArray()));
	}
}