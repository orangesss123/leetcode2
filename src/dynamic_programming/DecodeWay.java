package dynamic_programming;

import java.util.Scanner;

/*
 * 
 *A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26

求将密码解码回原密码有多少种解码方式？
 */

public class DecodeWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		while(!s.equals("exit"))
		{
			System.out.println(numDecodings(s));
			s=in.nextLine();
		}

	}

	public static int numDecodings(String s) {
        char []arrays = new char[s.length()];
        arrays = s.toCharArray();
        int leng = arrays.length;
	    if(s==null||s.length()==0||arrays[0]=='0')
	            return 0;
	    int []states = new int[leng+1];
	    states[0]=1;
	    for(int i=1;i<=leng;i++)
	    {
	        if(arrays[i-1]!='0')
              states[i]=states[i-1];
           if(i>1&&arrays[i-2]=='0')
                   continue;
	        if(i>1&&Integer.parseInt(s.substring(i-2,i))<27)
	        {
	            states[i]+=states[i-2];
	        }
               
	    }  
	        return states[leng];
	    }
}
