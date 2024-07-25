//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution{
     long floorSqrt(long x){
         
         
         int si = 1;
         int ei = (int)x;
         long ans = 0;
         while(si<= ei){
             int mid = (si+ei)/2;
             
             long val = (long)(mid)*(long)(mid);
             if(val<=x){
                 ans = (long)(mid);
                 si = mid+1;
             }else{
                 ei = mid-1;
             }
         }
         
         return ans;
         
         
		//This will give u TLE for sure..
    	/*	long ans = 0;
    		for(int i = 1;i<= x;i++){
    		    if(i*i <= x){
    		        ans = i;
    		    }
    		}
    		return ans;
    		
    	*/
	 }
}
