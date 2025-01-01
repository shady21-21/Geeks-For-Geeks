//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
          
        ArrayList<ArrayList<String>>ansList = new ArrayList<>();
        
        int n = arr.length;
        //for track visited or not create arr.
        boolean[]vis = new boolean[n];
        
        for(int i = 0;i<n;i++){
            
            if(vis[i]) continue; //if already vis the skip that string..
            
            ArrayList<String>list = new ArrayList<>();
            list.add(arr[i]);
            vis[i] = true;
            
            //now the same for other string and compair with prev
            for(int j = i+1;j<n;j++){
                if(!vis[j] && isAnagram(arr[i], arr[j])){
                    list.add(arr[j]);
                    vis[j] = true;
                }
            }
            ansList.add(list);
        }
        return ansList;
    }
    
    boolean isAnagram(String s1, String s2){
        
        if(s1.length()!= s2.length()){return false;}
        char[]s1Arr = s1.toCharArray();
        char[]s2Arr = s2.toCharArray();
        
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        
        return Arrays.equals(s1Arr, s2Arr);
    }
    
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends