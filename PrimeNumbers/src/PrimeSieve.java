import java.util.Arrays;

public class PrimeSieve {
	
	static int prime(int n) {
		int count = 0;
		boolean sieve[] = new boolean[n+1];
		Arrays.fill(sieve, true);
		for(int i = 2; i * i <= n; i++) {
			if(sieve[i]) {
				for(int j = i * i; j <= n; j += i ) {
					sieve[j] = false;
				}
			}
		}
		for(int i = 2; i < sieve.length; i++) {
			//System.out.println(i + "," + sieve[i]);
			if(sieve[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int count = prime(50);
		System.out.println("Count of prime num : " + count);
	}

}
