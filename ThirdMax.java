import java.lang.Math;

class ThirdMax {
	// Normal approach
	public static int findThirdMax(int[] nums) {
		Integer firstMax = null;
		Integer secondMax = null;
		Integer thirdMax = null;
		
		for (Integer num: nums) {
			if (num.equals(thirdMax) || num.equals(firstMax) || num.equals(secondMax)) {
				continue;
			}
			
			if (firstMax == null || num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (secondMax == null || num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if (thirdMax == null || num > thirdMax) {
				thirdMax = num;
			}
		}
		
		return (thirdMax == null) ? firstMax : thirdMax;
	}
	
	
	public static void main(String[] args) {
		//int[] arr1 = {2,2,3,1};
		//int[] arr2 = {2,1,1};
		//int[] arr3 = {2,1};
		int[] arr4 = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
		
		//System.out.println(findThirdMax(arr1));
		//System.out.println(findThirdMax(arr2));
		//System.out.println(findThirdMax(arr3));
		System.out.println(findThirdMax(arr4));
	}
}