//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends




//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<Integer> negList = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                 negList.add(arr[i]);
            }
            else {
                posList.add(arr[i]);
            }
        }
        
        int posIndex = 0;
        int negIndex = 0;
        int index = 0;
        while(posIndex < posList.size() && negIndex < negList.size()) {
            arr[index++] = posList.get(posIndex++);
            arr[index++] = negList.get(negIndex++);
        }
        
        while(posIndex < posList.size()) {
            arr[index++] = posList.get(posIndex++);
        }
        
        while(negIndex < negList.size()) {
            arr[index++] = negList.get(negIndex++);
        }
    }
}