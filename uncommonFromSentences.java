class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashSet<String> hs=new HashSet<String>();
        String new_string=A+" "+B;
        String[] split_string=new_string.split(" ");
        List<String> removed_str=new ArrayList<String>();
        if(new_string!=null|| !new_string.isEmpty()){
            for(String str:split_string){
            if(hs.contains(str)){
                hs.remove(str);
                removed_str.add(str);
            }else{
                if(!removed_str.contains(str))
                      hs.add(str);
            }
          }
        }
        String[] res=new String[hs.size()];
        int i=0;
        for(String st:hs){
            res[i]=st;
            i++;
        }
        return res;
    }
}
