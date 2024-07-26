//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

//User function Template for Java

            

class Complete{
    
  
    int KthMissingElement(int a[], int n, int k){
        //  return bruteFroce(a, k);
        
        return OptimalApproach(a, k);
       
    }
    
    int OptimalApproach(int[]arr, int k){
        
        int si = 0;
        int ei = arr.length-1;
        int i = arr[0]-1;
        int n = arr.length;
        while(si<=ei){
            int mid = (si+ei)/2;
            
            //cal the missing number at each index.
            int missingNum  = arr[mid] - (mid+1+i);
            if(missingNum < k){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        
        if(k>arr[n-1]-(n+i)){
            return -1;
        }
        return si + k+i;
    }
    
   
    int bruteFroce(int arr[], int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
    
  
    
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		   
		    int res = obj.KthMissingElement(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends