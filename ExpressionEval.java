import java.lang.*;
class Main {
  public static void main(String[] args) {
    String s = "11+3-2";
    int i = 0;
    int res = 0;
    while(i<s.length()) {
      char c = s.charAt(i);
      if(Character.isDigit(c)) {
        //res = s.charAt(i) - '0';
        res = res * 10 + (s.charAt(i) - '0');
         //System.out.println(res);
        i++;
      }
      else {
        if(s.charAt(i)=='+') {
          i = i+1;
          res = res + (s.charAt(i)-'0');
          //res = res * 10 + (s.charAt(i) - '0');
           //System.out.println(res);
           i++;
        }
        else if(s.charAt(i)=='-') {
          i = i+1;
          res = res  - (s.charAt(i) - '0');
          i++;
        }
      }
    }
    System.out.println(res);
  }
}
