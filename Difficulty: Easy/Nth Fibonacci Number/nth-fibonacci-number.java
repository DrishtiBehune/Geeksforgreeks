// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int MOD = 1000000007;  // Often required in coding problems
        int a = 0, b = 1, c = 0;
        
        for (int i = 2; i <= n; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }
        
        return c;
    }
}
