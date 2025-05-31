class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[]xx : matrix){
            for(int x: xx){
                list.add(x);
            }
        }
        
        
        Collections.sort(list);
        int n = list.size();
        return list.get(k - 1);
    }
}