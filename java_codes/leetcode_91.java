// Please run on leetcode compiler to check results
// string s can be a string of integers
// Example: "1234"
//Leetcode 91
class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[ s.length() + 1 ];
        Arrays.fill( dp, -1 );
        return helper( s, 0, dp );
    }
    
    int helper(String str, int idx, int dp[]) {
        
        if( idx == str.length() )
            return dp[idx] = 1;
        
        if( str.charAt(idx)  == '0')
            return dp[idx] = 0;
        
        if( dp[idx] != -1 )
            return dp[idx];
        
        int count = 0;
        
        count += helper( str, idx+1, dp );
        
        if( idx + 2 <= str.length() ) {
            // check if it is a valid 2 digit no
            int ch1  = str.charAt(idx) - '0';
            int ch2  = str.charAt(idx+1) - '0';
            
            int num = ch1*10 + ch2;
            if(num <= 26)
                count += helper( str, idx+2, dp );               
        }
        return dp[idx] = count;
    }
    
}