class Solution {
    public int compress(char[] chars) {
        
        int resultIndex = 0;
        int arrIndex = 0;
        int count;
        
        while(arrIndex < chars.length){
            
            char currChar = chars[arrIndex];         
            count = 1;
            arrIndex++;
            
            while(arrIndex < chars.length && chars[arrIndex] == currChar){
                arrIndex++;
                count++;
            }
            
            //System.out.println(arrIndex);
            //System.out.println(count);
            //System.out.println(resultIndex);
            chars[resultIndex] = currChar;
            resultIndex++;
            if(count==1) continue;
            else if(count > 1 && count <= 9) {
                chars[resultIndex] = (char)(count + '0');
                resultIndex++;
            }
            
            else if(count > 9) {
                System.out.println(resultIndex);
                //while(count > 0 && resultIndex < chars.length) 
                    String ans = String.valueOf(count);
                    char ch[] = ans.toCharArray();
                    
                    for(int i=0;i<ch.length;i++) {
                        chars[resultIndex++] = ch[i];
                    }
                    
                
            }
            
        }
        return resultIndex;
    }
}
            
