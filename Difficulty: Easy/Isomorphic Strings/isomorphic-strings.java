//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        
        HashMap<Character,Integer > map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i = 0;i<s1.length();i++){
            char currCh1 = s1.charAt(i);
            char currCh2 = s2.charAt(i);
            
            if(map1.put(currCh1, i) != map2.put(currCh2, i)){
                return false;
            }
        }
        return true;
    }
}