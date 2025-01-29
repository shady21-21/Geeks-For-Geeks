//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
         ArrayList<String> ll = new ArrayList<>();
         genPermutation(s,"",ll);
         HashSet<String> set = new LinkedHashSet<>();
         for(int i = 0 ; i < ll.size() ;i++){
             set.add(ll.get(i));
         }
        return new ArrayList<String>(set);
        
    }
    public void genPermutation(String str ,String ans, ArrayList<String> ll){
        if(str.length() == 0){
            ll.add(ans);
            return;
        }
        
        for(int i = 0;i<str.length();i++){
            char currCh = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            genPermutation(newString, ans+currCh , ll);
        }
        

    }
}