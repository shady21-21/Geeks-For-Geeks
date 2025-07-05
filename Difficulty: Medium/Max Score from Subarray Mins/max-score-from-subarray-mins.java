class Solution {
    public int maxSum(int[] arr) {
        int n = arr.length;
        if(n < 2)return 0;

        int maxSum = arr[0] + arr[1];
        int currSum = maxSum;

        for(int i = 2; i < n; i++){
            currSum = arr[i - 1] + arr[i]; 
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
