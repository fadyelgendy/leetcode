import java.util.Arrays;

class HeightChecker {
	public static int checkHeight(int[] heights) {
		int output = 0;
		
		// COPY OLD ARRAY
		int[] copy = new int[heights.length];
		for (int i = 0; i < heights.length; i++) {
			copy[i] = heights[i];
		}
		
		Arrays.sort(copy);
		
		// Compare the twoi arrays
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != copy[i])
				output++;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,4,2,1,3};
		System.out.println(checkHeight(arr));
	}
}