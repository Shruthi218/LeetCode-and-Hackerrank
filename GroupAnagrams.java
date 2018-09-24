/*
Step 1 : Sort the words individually one by one. This way we won't lose the orginal string array.
Step 2 : Take the first sorted word, add it into your hashmap if its not present. That will be the key 
and value will be the original word ( aet--> eat)
Step 3 : If the word is already present, then just keep appending the words from the string array. 
(aet--> eat,tea)
Step 4 : In the end, return the values of the hashMap.
Step 5 : Time complexity - O(N*klogK)


*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++) {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!mp.containsKey(s)) {
                mp.put(s,new ArrayList());
               // mp.get(s).add(strs[i]);
            }
            mp.get(s).add(strs[i]);
        }
        return new ArrayList(mp.values());
        
    }
}
