class Solution {
    public int vowelCount(String s) {
        // code here
       
       
       int[]volCnt = new int[5]; //a, e, i, o, u
       
        for(char ch : s.toCharArray()){
           if(ch == 'a')volCnt[0]++;
           else if(ch == 'e')volCnt[1]++;
           else if(ch == 'i')volCnt[2]++;
           else if(ch == 'o')volCnt[3]++;
           else if(ch == 'u')volCnt[4]++;
        }
       
       int totalVol = 0;
       int chProd = 1;
       
        for(int cnt : volCnt){
          
            if(cnt > 0){
              chProd*= cnt;
              totalVol++;
            } 
        }
        if(totalVol == 0)return 0;
        
        int perCnt = fac(totalVol);
        return perCnt*chProd;
    }
    
    int fac(int n){
        if(n == 0 || n == 1){return 1;}
        return n * fac(n - 1);
    }
}