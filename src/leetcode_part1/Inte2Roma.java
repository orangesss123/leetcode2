package leetcode_part1;

import java.util.Scanner;
import java.util.Stack;

public class Inte2Roma {

     public static void main(String []args){
    	 Scanner in = new Scanner(System.in);
    	 int integer = in.nextInt();
    	 while(integer != -1)
    	 {
    		 String roma= intToRoman(integer);
    		 System.out.println(roma);
    		 integer = in.nextInt();
    	 }
     }
	 public static String intToRoman(int num) {
	        int i = 1;//记录目前到了哪一位
	        String [] triple_ge ={"I","V","X"};//1~9用这个表示
	        String [] triple_shi ={"X","L","C"};//十位数上的1～9用这些表示
	        String [] triple_bai ={"C","D","M"};//百位数上的用这个表示
	        
	        String []subcat = {"I","X","C"};//可以用来减的数
	        Stack<String> contain = new Stack<>();
	        
	        int count = 0;
	        while(num != 0)
	        {
	            i*=10;
	            int pro = num % i;
	            num -= pro;
	            pro = pro/(i/10);
	            String tem="";
	            if(count == 0)
	               tem = proceed(pro,triple_ge);
	            if(count == 1)
	               tem = proceed(pro,triple_shi);
	            if(count == 2)
	               tem = proceed(pro,triple_bai);
	            if(count == 3)
	            {
	                tem = "";
	                for(int j= 0; j<pro; j++)
	                {
	                    tem+="M";
	                }
	            }
	            contain.push(tem);
	            count++;
	        }
	        StringBuilder res = new StringBuilder();
	        //倒出栈里面的字符串
	        while(!contain.isEmpty()){
	            res.append(contain.pop());
	        }
	        String finalres=res.toString();
	        return finalres;
	    }
	 public static String proceed(int num, String []alpha){
		 String res = "";
		 if(0<num&&num<4)
		 {
			 for(int i = 0; i< num;i++)
				 res+=alpha[0];
		 }
		 if(num==4)
			 res = alpha[0]+alpha[1];
		 if(4<num&&num<9)
		 {
			 res=alpha[1];
			 int repeattimes = num -5;
			 while(repeattimes>0)
			 {
				 res+=alpha[0];
				 repeattimes--;
			 }
		 }
		 if(num==9)
		 {
			 res = alpha[0]+alpha[2];
		 }
		 return res;
	 }
}
