//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Distance{
    int[]arr;
    int dist;
    
    Distance(int[]arr){
        this.arr = arr;
        this.dist = arr[0]*arr[0] + arr[1]*arr[1];
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        
        // PriorityQueue<int[]> pq = new PriorityQueue<>(
        //   (x,y) -> (x[0]*x[0] + x[1]*x[1]) - (y[0]*y[0] + y[1]*y[1])   
        // );
        
        
        // for(int[] xx : points){
        //     pq.offer(xx);
        // }
        
        // int[][]ans = new int[k][2];
        // int index = 0;
        // while(k>0){
        //     ans[index] = pq.poll();
        //     index++;
        //     k--;
        // }
        
        
        
        
        //++++++++++++ USE CLASS APPROACH++++++++++++
        
        PriorityQueue<Distance> pq = new PriorityQueue<>(
            (x,y) -> x.dist - y.dist
        );
        
        
        for(int[] xx : points){
            pq.offer(new Distance(xx));
        }
        
        int[][]ans = new int[k][2];
        int index = 0;
        while(k>0){
            ans[index] = pq.poll().arr;
            index++;
            k--;
        }
        return ans;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] points = new int[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = scanner.nextInt();
                points[i][1] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int[][] ans = solution.kClosest(points, k);

            Arrays.sort(ans, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });
            for (int[] point : ans) {
                System.out.println(point[0] + " " + point[1]);
            }
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends