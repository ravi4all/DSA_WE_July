import java.math.BigInteger;
import java.util.Scanner;

public class BinaryExponentiationBigInt {
	
	static BigInteger pow(BigInteger a, BigInteger b) {
		BigInteger result = new BigInteger("1");
		while(b.compareTo(BigInteger.ZERO) > 0) {
			//(b & 1) == 1
			if((b.and(BigInteger.ONE).compareTo(BigInteger.ZERO)) != 0) {
				//result *= a;
				result = result.multiply(a);
			}
			// calculate power
			//a *= a;
			a = a.multiply(a);
			// right shift by 1
			//b = b >> 1;
			b = b.shiftRight(1);
		}
		return result;
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		String num = scanner.next();
		BigInteger a = new BigInteger("2");
		BigInteger b = new BigInteger("100");
		BigInteger res = pow(a, b);
		System.out.println("Result is : " + res);
		
	}

}
