//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    public int maxDistance(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int maxDis = 0;
        
        for(int i = 0;i<arr.length ;i++){
            int currEle = arr[i];
            if(map.containsKey(currEle)){
                int index = map.get(currEle);
                maxDis = Math.max(maxDis, i-index);
            }else{
                map.put(currEle, i);
            }
        }
        return maxDis;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends