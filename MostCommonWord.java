
/* My Approach */

1. ReplaceAll the punctuation values with space in the paragraph string.
2. Split the string using space.
3. Iterate through the result string and store them in the map in key,value fashion in a map.
4. Save the banned words in a Set.
5. Check if word is not present in the set, also if its not present in the map, then insert the word into the map.
6. If its already present in the map, then increment the corresponding value of the map.
7. Iterate through the map and get the corresponding max value of the key associated with it.


class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    
        
        String[] words = paragraph.replaceAll("[!?',;.]","").toLowerCase().split(" ");
        HashMap<String,Integer> mp = new HashMap<String,Integer>();
        HashSet<String> set = new HashSet<String>();
        String res = " ";
        for(int j=0;j<banned.length;j++) {
            set.add(banned[j]);
        }
        
        for(int i=0;i<words.length;i++) {
            if(!set.contains(words[i])) {
                
                if(!mp.containsKey(words[i])) {
                    mp.put(words[i],1);
                }
                else {
                    mp.put(words[i],mp.get(words[i])+1);
                }
            
                
            }
        }
        
        int maxValueInMap=(Collections.max(mp.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                res =  entry.getKey();
            }
        }
        return res;
    }
}
       
