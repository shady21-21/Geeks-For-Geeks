//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
       
       int si = 0;
       int ei = arr.size()-1;
       int min = Integer.MAX_VALUE;
       int index = -1;
       while(si<= ei){
           int mid = (si+ei)/2;
           
           //it's means by array is already sorted
           if(arr.get(si)<= arr.get(ei)){
               min = Math.min(min, arr.get(si));
               index = arr.indexOf(min);
               break;
           }
           
           if(arr.get(si) <= arr.get(mid)){
              min = Math.min(min, arr.get(si));
              si = mid+1;
           }else{
               ei = mid-1;
               min = Math.min(min , arr.get(mid));
               
           }
       }
       index = arr.indexOf(min);
       return index;
       
    }
}