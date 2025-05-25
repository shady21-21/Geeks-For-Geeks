class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int x : arr){set.add(x*x);}
        
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(set.contains(arr[i]*arr[i] + arr[j]*arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}