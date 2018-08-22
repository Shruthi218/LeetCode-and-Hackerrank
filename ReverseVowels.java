public class Solution {
    public String reverseVowels(String s) {
        char[] list=s.toCharArray();
        int i =0,j = s.length()-1;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
         
        while(i<j) {
            if (!set.contains(list[i])) {
                i++;
                continue;
                
            }
            if (!set.contains(list[j])) {
                j--;
                continue;
                
            }
            char temp=list[i];
            list[i]=list[j];
            list[j]=temp;
            i++;
            j--;
        }
        
        String res = new String(list);
        return res;
    }
}
