class MyHashMap {

    /** Initialize your data structure here. */
    int myarr[] = new int[1000000];
    
    public MyHashMap() {
        //This is interesting
        Arrays.fill(myarr,-1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        myarr[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return myarr[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        myarr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
