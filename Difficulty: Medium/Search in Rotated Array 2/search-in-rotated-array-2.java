//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int N;
            N = Integer.parseInt(br.readLine().trim());

            int[] A = IntArray.input(br, N);

            int Key;
            Key = Integer.parseInt(br.readLine().trim());

            Solution obj = new Solution();
            boolean res = obj.Search(N, A, Key);

            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean Search(int n, int[] arr, int key) {
        
        
        int si = 0;
        int ei = n-1;
        
        
         while(si<= ei){
            int mid = (si+ei)/2;
            
            if(arr[mid] == key)return true;
            
            //for duplicate ..
            if(arr[si] == arr[mid] && arr[mid] ==  arr[ei]){
                si++;
                ei--;
                continue;
            }
            
            
            if(arr[si]<= arr[mid]){
                if(arr[si]<= key && arr[mid]>key){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }else{
                // right part is sorted.
                if(arr[mid]<key && arr[ei] >= key){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }
        }
        return false;
    }
}
