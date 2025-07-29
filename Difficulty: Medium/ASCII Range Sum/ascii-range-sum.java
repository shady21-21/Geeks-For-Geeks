class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){map.put(ch, map.getOrDefault(ch, 0) + 1);}
        
        // System.out.println("MAP IS. : " + map);
        ArrayList<Integer> list  = new ArrayList<>();
        for(char ch : map.keySet()){
            if(map.get(ch) > 1){
                
                int fstOcc = s.indexOf(ch);
                int lstOcc = s.lastIndexOf(ch);
                
                int sum = 0;
                for(int i = fstOcc + 1 ;i<lstOcc;i++){
                    sum+= s.charAt(i);
                }
                
                if(sum > 0){list.add(sum);}
            }
        }
        // System.out.println("MY LIST IS LOOK LIKE : " + list);
        
        return list;
    }
}