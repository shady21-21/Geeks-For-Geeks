//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.palinArray(arr) ? "true" : "false");
        }
    }
}
// } Driver Code Ends


/*Complete the Function below*/
class Solution {
    public static boolean palinArray(int[] arr) {
       int cnt = 0;
       for(int i = 0;i<arr.length;i++){
           if(checkPalindrom(arr[i]) == true){
               cnt++;
           }
       }
       return (cnt == arr.length) ? true : false;
    }
    
    // check number is palindrom or not.
    static boolean checkPalindrom(int n){
        int orgNum = n;
        int revNum = 0;
        while(n>0){
            int lastDig = n%10;
            revNum = lastDig + (revNum*10);
            n = n/10;
        }
        if(orgNum == revNum){
            return true;
        }
        return false;
    }
}