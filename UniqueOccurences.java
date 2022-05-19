class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
       HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i: hm.values())
        {
            if(!set.contains(i))
                set.add(i);
            else 
                return false;
        }
        return true;
    }
}
