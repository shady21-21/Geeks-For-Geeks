//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String s) {
        // code here
        
        Stack<Character>stk = new Stack<>();
        
        for(char chh : s.toCharArray()){
            
            if(chh == '(' || chh == '{' || chh == '['){
                stk.push(chh);
            }else{
                if(stk.isEmpty()){return false;}
                
                char topChar  = stk.pop();
                if(chh == ')' && topChar!= '('||
                   chh == '}' && topChar!= '{'||
                   chh == ']' && topChar!= '['){
                       return false;
                   }
                
            }
        }
        return stk.isEmpty();
    }
}
