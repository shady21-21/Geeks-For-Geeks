//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
      
      // Time Complexity -> 0(n+m)
      //Space Complexity -> 0(1)
      //Apply two pointer approach.
      int i = 0;
      int j = 0;
      
      ArrayList<Integer> list = new ArrayList<>();
      while(i<n && j<m){
          if(arr1[i] <= arr2[j]){
             
             if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
               
               list.add(arr1[i]);
               
             } 
             i++;
          }else{
              if(list.size() == 0  || list.get(list.size()-1) != arr2[j]){
               
               list.add(arr2[j]);
              } 
             j++;
          }
          
      }
      
      // the elements which are left.
      while(i<n){
          if(list.get(list.size()-1)!= arr1[i]){
               
               list.add(arr1[i]);
              
            }
             i++;
      }
       while(j<m){
          if(list.get(list.size()-1)!= arr2[j]){
               
               list.add(arr2[j]);
              
            }
             j++;
      }
      
      
     return list;
      
      
      /* 
      This code Time complexity is -> 0(n + m) + 0(n Log n) 
      
       HashSet<Integer> set = new HashSet<>();
       
       for(int i : arr1){
           set.add(i);
       }
       for(int i : arr2){
           set.add(i);
       }
       
       ArrayList<Integer> list = new ArrayList<>();
       for(Integer ele: set){
           list.add(ele);
       }
       Collections.sort(list); //here extra time take 0 (n log n)
       return list;
       */
    }
}



