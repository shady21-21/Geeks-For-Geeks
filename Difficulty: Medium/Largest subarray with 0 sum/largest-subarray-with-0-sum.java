//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG{
    int maxLen(int arr[], int n){
        
       
       
       //Apply the same logic Largest subarray with 0 sum with bit change.
       
       HashMap<Integer, Integer> map = new HashMap<>();
       int sum = 0;
       int maxLen = Integer.MIN_VALUE;
       for(int i = 0;i<n;i++){
           sum += arr[i];
           
           if(sum == 0){
               maxLen = Math.max(maxLen, i+1);
           }
           if(map.containsKey(sum-0)){
               maxLen = Math.max(maxLen, i - map.get(sum));
           }else{
               map.put(sum, i);
           }
       }
        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
       
      
        /*
        * This is 0(N^2) Sol so give TLE
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                 sum+= arr[j];
                if(sum == 0){
                  maxLen = Math.max(maxLen, j-i+1);  
                }
            }
        }
        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
        */
    }
}