class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
     HashMap<Integer,Integer> mp = new HashMap<>();
        int res[] = new int[A.length];
        for(int i=0;i<B.length;i++) {
            mp.put(B[i],i);
        }
        
        for(int j=0;j<A.length;j++) {
            res[j] = mp.get(A[j]);
        }
        
        
        return res;
    }
}
