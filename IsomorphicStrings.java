public class Solution {
public boolean isIsomorphic(String s, String t) {

    if(s.length()==0 || s.length()==1)
    return true;
    
    Map<Character,Character> map = new HashMap<Character,Character>();
    
    
    for(int i=0; i<s.length(); i++){
        if(map.containsKey(s.charAt(i))){
            
            char temp = map.get(s.charAt(i));
            if(temp!=t.charAt(i))
                return false;
        }
        else if(map.containsValue(t.charAt(i))){
            return false;
        }
        else
        map.put(s.charAt(i) , t.charAt(i));
    }
    
    return true;
}
}
