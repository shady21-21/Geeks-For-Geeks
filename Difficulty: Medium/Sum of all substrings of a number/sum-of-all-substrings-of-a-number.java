class Solution {
    public static int sumSubstrings(String s) {
        // code here
       return sol(s);
    }
    
   
    static ArrayList<String>generateAllSubstring(String s){
       
       ArrayList<String> list = new ArrayList<>();
       
       int n = s.length();
       
       for(int i = 0;i<n;i++){
           for(int j = i+1;j<=n;j++){
               list.add(s.substring(i, j));
           }
       }
       
    //   System.out.println("LIST IS : " + list);
        return list;
   }
   
    static int sol(String s){
        
       ArrayList<String> list = generateAllSubstring(s);
       int sum = 0;
        for(String  x : list){
           int val = Integer.parseInt(x);
           sum+= val;
        }
       
        return sum;
    }
}