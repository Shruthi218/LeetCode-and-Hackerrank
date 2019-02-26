class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> myset = new HashSet<>();
        for(String s : emails) {
            int i = s.indexOf("@");
            String local = s.substring(0,i);
            // test.email+alex
            String domain = s.substring(i+1,s.length());
            // leetcode.com
            if(local.contains(".")) {
                local = local.replace(".", "");
            }
            
            if(local.contains("+")) {
                int plus = local.indexOf("+");
                local = local.substring(0,plus);
            }
            
            
            myset.add(local + domain);
            
        
    }
        return myset.size();
    }
}
