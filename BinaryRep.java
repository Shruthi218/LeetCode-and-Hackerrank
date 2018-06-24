import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		int n = 6;
		while(n>=1) {
		    s1.push(n%2);
		    n = n/2;
		}
		
		while(!s1.isEmpty()) {
		System.out.print(s1.pop());
	}
	}
}
