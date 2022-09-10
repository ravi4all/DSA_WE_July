public class DivisibleByPrimeSet {
	
	static int countSetOptimized(int n) {
		int result = 0;
		while(n > 0) {
			n = n & (n-1);
			result++;
		}
		return result;
	}
	
	static void solution(int n) {
		int prime[] = {2,3,5};
		int m = prime.length;
		int ans = 0;
		for(int i = 1; i < (1 << m); i++) {
			int lcm = 1;
			for(int j = 0; j < m; j++) {
				// if jth bit of ith element is set then include it
				if(((i >> j) & 1) == 1) {
					lcm *= prime[j];
				}
			}
			if(countSetOptimized(i) % 2 == 0) {
				ans -= (n/lcm);
			}
			else {
				ans += (n/lcm);
			}
		}
		System.out.println("Ans is :: " + ans);
	}

	public static void main(String[] args) {
		
		solution(20);

	}

}
