//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int findOnce(int arr[], int n){
        
      
      //check some corener cases.
      if(n == 1)return arr[0];
      if(arr[0]!=arr[1])return arr[0];
      if(arr[n-1]!= arr[n-2])return arr[n-1];
      
      int si = 1;
      int ei = n-2;
      while(si<= ei){
          int mid = (si+ei)/2;
          
          if(arr[mid]!= arr[mid+1] && arr[mid]!= arr[mid-1])return arr[mid];
          
          //if some how my mid is on even index 
          //and mid is on odd index.
          if(mid%2 == 0 && arr[mid] == arr[mid+1] 
            || mid%2 == 1 && arr[mid] == arr[mid-1]){
                // my ans is on right side.
                si = mid+1;
            }else{
                ei = mid-1;
            }
      }
      
        
      return -1;  
        
      
    /* 
    
    Here, 
    Time Complexity is : 0(N) + 0(N) = 0(N).
    Space Complexity is : 0(N) //for taking Map.
    
    
    HashMap<Integer, Integer> map = new HashMap<>();
       for(int i:arr){
           map.put(i, map.getOrDefault(i, 0)+1);
       }
       int ans = 0;
       for(Integer ele:map.keySet()){
           if(map.get(ele) == 1){
               ans = ele;
           }
       }
       return ans;
       
       */
    }
}