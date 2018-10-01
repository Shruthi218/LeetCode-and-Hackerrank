class MyHashSet {

    /** Initialize your data structure here. */
    List<Integer> al = new ArrayList<Integer>(); 
    public MyHashSet() {
       
    }
    
    public void add(int key) {
        if(!al.contains(key)) {
        al.add(key);
        }
    }
    
    
    /** Returns true if this set contains the specified element */
    public void remove(int key) {
        if(al.contains(key)){
            for(int i=0;i<al.size();i++){
                if(al.get(i).equals(key)){
                    al.remove(i);
                    break;
                }
            }
        }
    }
    
    public boolean contains(int key) {
        if(al.contains(key)) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
