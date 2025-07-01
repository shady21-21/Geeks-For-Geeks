class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = a.length;
        int m = b.length;
        
        // for(int i = 0;i<n;i++){
        //     int cnt = 0;
        //     for(int j = 0;j<m;j++){
        //         if(a[i] >= b[j]){
        //             cnt++;
        //         }
        //     }
        //     xx.add(cnt);
        // }
        
        Arrays.sort(b);
        for(int x : a){
            int cnt = bSearch(b, x);
            ans.add(cnt);
        }
        return ans;
    }
    
    static int bSearch(int[]arr, int target){
        
        int si = 0;
        int ei = arr.length - 1;
        int cnt = 0;
        
        while(ei >= si){
            int mid = si + (ei - si)/2;
            if(arr[mid] <= target){
                cnt = mid + 1;
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return cnt;
    }
    
    
    
    
    
}