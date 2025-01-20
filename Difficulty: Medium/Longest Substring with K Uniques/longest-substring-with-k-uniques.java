//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        
        int n = s.length();
        int maxLen = -1;
        
        // for(int i = 0;i<n;i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j = i;j<n;j++){
        //         set.add(s.charAt(j));
                
        //         if(set.size() > k){break;}
                
        //         if(set.size() == k){
        //              maxLen = Math.max(maxLen, j-i + 1);
        //         } 
        //     }
        // }
        
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < n){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch, 0)+1);
            
            while(map.size() > k){
                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);
                if(map.get(leftCh) == 0){
                    map.remove(leftCh);
                }
                left++;
            }
            
            if(map.size()  == k){
                maxLen = Math.max(maxLen , right - left + 1);
            }
            right++;
        }
        return maxLen;
    } 
}