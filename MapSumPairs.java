class MapSum {

    /** Initialize your data structure here. */
    HashMap<String,Integer> mp;
    public MapSum() {
        mp = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        mp.put(key,val);
    }
    
    public int sum(String prefix) {
        int result = 0;
        for(Map.Entry<String,Integer> entry : mp.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(key.startsWith(prefix)) {
                result = result+value;
            }
        }
        return result;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
