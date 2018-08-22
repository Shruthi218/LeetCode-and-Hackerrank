class Solution {
    public int countSegments(String s) {
        if (s==null) return 0;
        s = s.trim();
        if (s.length()==0) return 0;
        String[] symbols = s.split("\\s+");
        /*for(int i=0;i<symbols.length;i++) {
            System.out.println(symbols[i]);
        }
        */
        
        return symbols.length;
    }
}

