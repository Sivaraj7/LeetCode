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