public class SimplePrimeNumberP3 {
	
	static void primeNum(int n) {
		boolean prime = true;
		int iter = 0;
		// 1 is neither prime nor composite
		if(n == 1) {
			System.out.println("1 is neither prime nor composite...");
			return;
		}
		if(n % 2 == 0 || n % 3 == 0) {
			System.out.println("Number is not prime...");
			return;
		}
		for(int i = 5; i * i < n; i+=6) {
			iter++;
			if(n % i == 0 || n % i + 2 == 0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
		System.out.println("Number of iterations : " + iter);
	}

	public static void main(String[] args) {
		
		int n = (int)Math.pow(10, 9) + 7;
		primeNum(n);

	}

}
