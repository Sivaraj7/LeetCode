class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;

        
        boolean[] isPrime = new boolean[n];
        int ans = 0;

       
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int num = 2; num * num < n; num++) {
            if (isPrime[num]) {
                
                for (int mult = num * num; mult < n; mult += num) {
                    isPrime[mult] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                ans++;
            }
        }

        return ans;
    }
}