class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        
        Stack<Pair> stack = new Stack<>();
        int n = color.length;

        for(int i = 0; i < n; i++){
            Pair curr = new Pair(color[i], radius[i]);
            
            if(!stack.isEmpty() && stack.peek().col == curr.col && stack.peek().rad == curr.rad){
                stack.pop(); 
            }else{
                stack.push(curr);
            }
        }
        return stack.size(); 
    }
}

class Pair{
    int col;
    int rad;
    
    Pair(int col, int rad){
        this.col = col;
        this.rad = rad;
    }
}