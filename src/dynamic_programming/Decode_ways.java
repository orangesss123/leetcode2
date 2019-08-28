package dynamic_programming;
/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits,
 determine the total number of ways to decode it.
 */

//难点：在处理0的上面，比如101，10，100，0等
public class Decode_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "233324";
		System.out.print(Integer.parseInt("01"));
	}
	 public int numDecodings(String s) {
	        if(s.charAt(0)=='0')
	            return 0;
	        int []states = new int[s.length()+1];
	        states[0]=1;
	        for(int i=1;i<=s.length();i++)
	        {
	         if(s.charAt(i-1)!='0')
                states[i]=states[i-1];
             if(i>1&&s.charAt(i-2)=='0')
                continue;
	         if(i>1&&0<Integer.parseInt(s.substring(i-2,i))&&Integer.parseInt(s.substring(i-2,i))<27)
	            {
	                states[i]+=states[i-2];
	            }
             
	        }
   
	        return states[s.length()];
	    }

}
