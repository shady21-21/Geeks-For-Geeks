class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int ele : arr){map.put(ele, map.getOrDefault(ele, 0) + 1);}
        
        //for the debugin peropse lets print the map.
        // System.out.println("MY MAP IS LOOK LIKE : " + map);
        for(int ele : map.keySet()){
            int currFq = map.get(ele);
            if(currFq > n/3){list.add(ele);}
        }
        Collections.sort(list);
        
        return list;
    }
}