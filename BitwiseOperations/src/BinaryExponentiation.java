public class BinaryExponentiation {
	
	static int pow(int a, int b) {
		int result = 1;
		while(b > 0) {
			if((b & 1) == 1) {
				result *= a;
			}
			// calculate power
			a *= a;
			// right shift by 1
			b = b >> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		int res = pow(2, 100);
		System.out.println("Result is : " + res);
	}

}
