public class CountSetBit {
	
//	TC : O(Total Bits in N)
	static int countSet(int n) {
		int result = 0;
		while(n > 0) {
//			if(n % 2 != 0) {
//				result++;
//			}
//			n = n/2;
			
			if((n & 1) == 1) {
				result++;
			}
			n = n >> 1;
		}
		return result;
	}
	
	static int countSetOptimized(int n) {
		int result = 0;
		while(n > 0) {
			n = n & (n-1);
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Result :: " + countSet(5));
	}

}
