class ValidMountainArray {
	public static int findPeak(int[] arr) {
		int index = -1;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				index = -1;
			} else if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static boolean isValidMountain(int[] arr) {
	    if (arr.length < 3) {
			return false;
		}
		
		int peakIndex = findPeak(arr);
		if (peakIndex == -1 || peakIndex == arr.length -1 || peakIndex == 0) return false;
		
		// check left
		int firstLeft = 0;
		int secondLeft = firstLeft + 1;
		while(secondLeft < peakIndex) {
			if (arr[firstLeft] >= arr[secondLeft] || arr[firstLeft] == arr[peakIndex] || arr[secondLeft] == arr[peakIndex]) {
				return false;
			}
            firstLeft++;
            secondLeft++;
		}
		
		int firstRight = peakIndex + 1;
		int secondRight = firstRight + 1;
		
		while(secondRight < arr.length) {
			if (arr[firstRight] <= arr[secondRight] || arr[firstRight] == arr[peakIndex] || arr[secondRight] == arr[peakIndex]) {
				return false;
			}
            
            firstRight++;
            secondRight++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,3,2,1};
		System.out.println(isValidMountain(arr));
	}
}