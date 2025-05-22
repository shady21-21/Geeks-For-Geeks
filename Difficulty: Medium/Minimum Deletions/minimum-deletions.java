class Solution {
    static int minDeletions(String s) {
        // code here
        
        // return s.length() - cntLps(s, 0, s.length() - 1);
        int n = s.length();
        int[][]dp = new int[n][n];
        
        for(int[]xx :dp){
            Arrays.fill(xx, -1);
        }
        
        return n - memoiz_CntLps(s, 0, n - 1, dp) ;
    }
    
    //this is recursive approach give - TLE.
    // static int cntLps(String s, int low, int high){
        
        
    //     //base case.
    //     if(low > high) return 0;
        
    //     if(low == high) return 1;
        
    //     //my 1st char is equal to lastCharacter.
    //     if(s.charAt(low) == s.charAt(high)){
    //         return cntLps(s, low + 1, high - 1) + 2;
    //     }
        
        
    //     return Math.max(cntLps(s, low + 1, high), cntLps(s, low, high - 1));
    // }
    
    // Now memoized it to avoide the TLE.
    
    static int memoiz_CntLps(String s, int low, int high, int[][]dp){
        
        
        //base case.
        if(low > high) return 0;
        
        if(low == high) return 1;
        
        
        if(dp[low][high]  != -1){return dp[low][high];}
        
        //my 1st char is equal to lastCharacter.
        if(s.charAt(low) == s.charAt(high)){
            return dp[low][high] =  memoiz_CntLps(s, low + 1, high - 1, dp) + 2;
        }
        
        
        return dp[low][high] =  Math.max(memoiz_CntLps(s, low + 1, high, dp) , memoiz_CntLps(s, low, high - 1, dp));
    }
}