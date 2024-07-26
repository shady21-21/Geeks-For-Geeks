//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];

            int D = Integer.parseInt(read.readLine());

            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr, N, D));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        
        //min capacity to load all the weight is max wei in the arr.
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:arr){
            max = Math.max(max, i);
            sum+= i;
        }
        
        int si = max;
        int ei = sum;
        while(si<= ei){
            int mid = (si+ei)/2;
            if(findDays(arr, mid) <= d){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return si;
    }
    
    
    // first find out for "X" capacity how may days to take.
    
    static int findDays(int[]arr, int x){ // x -> Capacity
        
        int days = 1;
        int load = 0;
        for(int wei:arr){
            if(load + wei > x){
                days++;
                //update my currload.
                load = wei;
            }else{
                load+=wei;
            }
        }
        return days;
    }
};