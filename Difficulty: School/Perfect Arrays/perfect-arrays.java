//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.isPerfect(n, arr);
            if (res)
                System.out.println("PERFECT");
            
            else 
                System.out.println("NOT PERFECT");
            
               
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean isPerfect(int n, int[] arr) {
        // code here
        int si = 0;
        int ei = n-1;
        while(ei>si){
            if(arr[si] != arr[ei]){
                return false; 
            }
            si++;
            ei--;
        }
        return true;
    }
}
        
