class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        String sentence1[] = A.split(" ");
        String sentence2[] = B.split(" ");
        List<String>result = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0;i<sentence1.length;i++) {
            if(!map.containsKey(sentence1[i])) {
                map.put(sentence1[i],1);
            }
            else {
                map.put(sentence1[i],map.get(sentence1[i])+1);
            }
        }
        
        for(int j=0;j<sentence2.length;j++) {
            if(!map.containsKey(sentence2[j])) {
                map.put(sentence2[j],1);
            }
            
            else {
                map.put(sentence2[j],map.get(sentence2[j])+1);
            }
        }
        
        
        
        
        for (Map.Entry<String,Integer> pair : map.entrySet()){ 
            //System.out.println(pair.getKey()+" "+pair.getValue()); 
            
            if(pair.getValue()==1) {
                result.add(pair.getKey());
            }
        }
    
        
        String[] res = new String[result.size()];
        res = result.toArray(res);
        return res;
    }
}
