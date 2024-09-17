class Solution {
    public int countPrimes(int n) {
  // Sieve of Eratosthenes algorithm to count the number of prime numbers less than a given integer n

  if (n < 2)
  return 0;

        boolean[] seen = new boolean[n];
        int ans = 0;

        for (int num = 2; num < n; num++) 
        {
            if (seen[num]) 
            continue;
            ans++;
            if ((long)num * num >= n) 
            continue;
           
            for (int mult = num * num; mult < n; mult += num) 
            {
                seen[mult] = true;
            }
        }

        return ans;
}
}
/*
class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;

        // Use an array to mark non-prime numbers
        boolean[] isPrime = new boolean[n];
        int ans = 0;

        // Initialize the array to true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int num = 2; num * num < n; num++) {
            if (isPrime[num]) {
                // Mark all multiples of num starting from num*num
                for (int mult = num * num; mult < n; mult += num) {
                    isPrime[mult] = false;
                }
            }
        }

        // Count the primes
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                ans++;
            }
        }

        return ans;
    }
}*/