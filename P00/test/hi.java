
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21029424, 27 May 2022 3:14:57 pm
 */

public class hi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello, world!");
	}
	
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
