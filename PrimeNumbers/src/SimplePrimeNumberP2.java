public class SimplePrimeNumberP2 {
	
	static void primeNum(int n) {
		boolean prime = true;
		int iter = 0;
		// 1 is neither prime nor composite
		if(n == 1) {
			System.out.println("1 is neither prime nor composite...");
			return;
		}
		for(int i = 2; i * i < n; i++) {
			iter++;
			if(n % i == 0) {
				//System.out.println("Not prime...");
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
		// TODO Auto-generated method stub
		//int n = (int)Math.pow(10, 9) + 7;
		int n = 101;
		primeNum(n);
	}

}
