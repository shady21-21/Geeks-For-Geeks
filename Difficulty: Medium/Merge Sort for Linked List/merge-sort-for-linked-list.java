//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/*
The structure of linked list is the following

class Node
{
int data;
Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    static Node mergeSort(Node head) {
        
       if(head == null)return head;
       
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
          @Override
            public int compare(Node a, Node b){
              return a.data - b.data; //this is give data as accending order.
            }
        });
        
        Node curr = head;
        while(curr!= null){
            pq.offer(curr);
            curr = curr.next;
        }
       //pq look like : []
        head = pq.poll(); // head = [1]->[2]->[3]->[4]->[5]->null;
        curr = head;
        while(!pq.isEmpty()){
            curr.next = pq.poll();
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().mergeSort(head);
            printList(head);
        }
    }
}

// } Driver Code Ends