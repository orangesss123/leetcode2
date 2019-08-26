package leetcode_part1;

import java.util.Scanner;

public class Prefix {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		while(!s.equals("exit"))
		{
			String []strs = s.split(",");
			System.out.println(strs[1]);
			System.out.println(longestCommonPrefix(strs));
			s=in.nextLine();
		}
	}
	 public static String longestCommonPrefix(String[] strs) {
	        int str_len=strs.length;
	        //找出最短的字符串
	        int small_length=strs[0].length();
	        for(int i=1;i<str_len;i++)
	        {
	            small_length=Math.min(small_length,strs[i].length());
	        }
	        if(small_length==0)
	            return "";
	        
	        int index = 0;//下标记录目前相等的位置
	        boolean flag=true;//位置上的字符是否相等
	        for(int i=0;i<small_length;i++)
	        {
	            int str_num=0;
	            while(flag&&str_num<str_len-1)
	            {
	                flag=strs[str_num].charAt(i)==strs[str_num+1].charAt(i)?true:false;
	                str_num++;
	            }
	            if(flag==false)
	                break;
	            index++;
	        }
	        return strs[0].substring(0,index);
	    }
	 /*
	  * method2:简化方法
	  */
	 public static String longestCommonPrefix2(String[] strs) {
	        if(strs == null||strs.length==0) return "";
         for(int i=0;i<strs[0].length();i++)
         {
             char compare=strs[0].charAt(i);
             for(int j=1;j<strs.length;j++)
             {
                 if(strs[j].length() == i|| strs[j].charAt(i)!=compare)
                     return strs[0].substring(0,i);
             }
         }
          return strs[0];
	    }
	 /*
	  * 用类似于归并排序的方法来进行
	  */
	 public static String longestCommonPrefix3(String []strs){
		 if(strs.length==0||strs==null) return "";
		 return longestCommonPrefix3(strs,0,strs.length);
	 }
	 
	 public static String longestCommonPrefix3(String []strs,int left,int right)
	 {
		 //base case
		 if(left==right)
			 return strs[left];
		 else
		 {
			 int mid = (left+right)/2;
			 String left_prefix= longestCommonPrefix3(strs,left,mid);
			 String right_prefix = longestCommonPrefix3(strs,mid+1,right);
			 return commonprefix(left_prefix,right_prefix);
		 }
	 }
	 public static String commonprefix(String left,String right){
		 for(int i=0;i<left.length();i++)
		 {
			 if(i==right.length()||left.charAt(i)!=right.charAt(i))
				 return left.substring(0,i);
		 }
		 return left;
	 }
}
