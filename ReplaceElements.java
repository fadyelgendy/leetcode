import java.util.Arrays;

class ReplaceElements {
	public static int[] replaceElements(int[] arr) {
		int max = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			max = arr[i] > max ? arr[i] : max;
			if (arr[i] < max) {
				arr[i] = max;
			}
		}
		
		for (int i  = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		arr[arr.length - 1] = -1;
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,5,1,2,3,4};
		
		System.out.println(Arrays.toString(replaceElements(arr)));
	}
}