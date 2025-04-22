//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.findUnique(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findUnique(int[] arr) {
        // code here
        
        HashMap<Integer,Integer> mapp = new HashMap<>();
        
        for(int xx : arr){
            mapp.put(xx, mapp.getOrDefault(xx, 0) + 1);
        }
        
        // for(Map.Entry<Integer,Integer> E : mapp.entrySet()){
        //     int K = E.getKey();
        //     if(K == 1){
        //         return E.getValue();
        //     }
        // }
        
        for(int ele : mapp.keySet()){
            if(mapp.get(ele) == 1){
                return ele;
            }
        }
        return -1;
    }
}