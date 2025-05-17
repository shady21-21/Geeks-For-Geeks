//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read the array line and convert to int[]
            String input = br.readLine().trim();
            String[] tokens = input.split("\\s+");
            int n = tokens.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Read a, b, c from separate lines
            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());
            int c = Integer.parseInt(br.readLine().trim());

            // Call the solution method
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.sortArray(arr, a, b, c);

            // Output the result
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int x : arr){
            int eqAns = A*(int)Math.pow(x,2) + B*x + C;
            list.add(eqAns);
        }

        mergeSort(list, 0, list.size() - 1);
        return list;
    }
    
    void mergeSort(ArrayList<Integer> list, int si, int ei) {
        if(si >= ei) return;
        
        int mid = si + (ei - si) / 2;
        mergeSort(list, si, mid);      // left half
        mergeSort(list, mid + 1, ei);  // right half
        merge(list, si, mid, ei);
    }
    
    void merge(ArrayList<Integer> list, int si, int mid, int ei) {
        int index1 = si;
        int index2 = mid + 1;
        ArrayList<Integer> ansList = new ArrayList<>();
        
        while(index1 <= mid && index2 <= ei) {
            if(list.get(index1) < list.get(index2)) {
                ansList.add(list.get(index1));
                index1++;
            } else {
                ansList.add(list.get(index2));
                index2++;
            }
        }
        
        while(index1 <= mid) {
            ansList.add(list.get(index1));
            index1++;
        }
        
        while(index2 <= ei) {
            ansList.add(list.get(index2));
            index2++;
        }
        
        int k = si;
        for(int i = 0; i < ansList.size(); i++) {
            list.set(k, ansList.get(i));
            k++;
        }
    }
}
