package newcoder;

import java.util.Scanner;

public class blankspace_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		blankspace_replace test = new blankspace_replace();
		while(!s.equals("exit"))
		{
			StringBuffer s1 = new StringBuffer(s);
			String newone = test.replaceSpace(s1);
			System.out.println(newone);
			s=in.nextLine();
		}
	}
    public String replaceSpace(StringBuffer str) {
    //先找出所有为空哥的字符的位置
        String strr="%20";
        int len=str.length();
        int spacenum =0;
        for(int i =0;i<str.length();i++)
        {
        	if(str.charAt(i) == ' ')
        		spacenum++; 
        }
        int oldindex = str.length()-1;
        int new_length = len+2*spacenum;
        str.setLength(new_length);
        int newindex = new_length-1;
        for(;oldindex>=0&&oldindex<newindex;--oldindex)
        {
        	if(str.charAt(oldindex) == ' ')
        		{
        		str.setCharAt(newindex--, '%');
        		str.setCharAt(newindex--, '0');
        		str.setCharAt(newindex--, '2');
        		}
        	else
        		str.setCharAt(newindex--, str.charAt(oldindex));
        }
        return str.toString();
    }

}
