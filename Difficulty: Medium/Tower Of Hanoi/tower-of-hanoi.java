//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;

            // taking input N
            N = sc.nextInt();

            // calling toh() method
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// avoid space at the starting of the string in "move disk....."
class Hanoi {

   public long toh(int n, int from, int to, int aux) {
        // Base case: when there is only 1 disk, move it directly from the source to the destination.
        if (n == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return 1;
        }

        // Step 1: Move n-1 disks from the source to the auxiliary rod.
        long moveCnt = toh(n - 1, from, aux, to);

        // Step 2: Move the nth disk from the source rod to the destination rod.
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        moveCnt++;

        // Step 3: Move the n-1 disks from the auxiliary rod to the destination rod.
        moveCnt += toh(n - 1, aux, to, from);

        return moveCnt;
    }
}
