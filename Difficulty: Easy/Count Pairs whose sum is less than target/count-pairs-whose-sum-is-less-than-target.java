//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

// class Pair{
//     int fst;
//     int snd;
    
//     Pair(int fst, int snd){
//         this.fst = fst;
//         this.snd = snd;
//     }
// }

class Solution {
    int countPairs(int arr[], int target) {
        
        // ArrayList<Pair> list = new ArrayList<>();
        
        
        Arrays.sort(arr); //[2, 3,  5, 7]
                          // [1, 2, , 2, 3, 4, ]
        int n = arr.length;
        int cnt = 0;
        
        int i = 0;
        int j = n-1;
        
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum < target){
                cnt += j-i;
                i++;
            }else{
               j--;
            }
            
        }
        
        return cnt;
        
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(arr[i] + arr[j] < target){
        //             // list.add(new Pair(arr[i], arr[j]));
        //             cnt++;
        //         }
        //     }
        // }
        // return list.size();
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends