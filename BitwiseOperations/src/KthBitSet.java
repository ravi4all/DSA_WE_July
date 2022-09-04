public class KthBitSet {

	public static void main(String[] args) {
		
		int n = 5;
		int k = 3;
		// Left Shift
		if((n & (1 << (k-1))) != 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		// Right Shift
		if((n >> (k-1) & 1) != 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
