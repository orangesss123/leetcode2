package newcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class maxslidewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		while(s.equals("exit")){
			String []num = s.split(",");
			int []nums = new int[num.length];
			int index=0;
			for(String ea:num)
			{
				nums[index++] = Integer.parseInt(ea);
			}
			System.out.println(maxInWindows(nums,3));
			s= in.nextLine();
		}

	}
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int begin=0;
        int end = num.length;
        help(num,begin,size,end,res);
        return res;
    }
    public static void help(int []num, int begin, int size, int end, ArrayList<Integer> res){
        if((begin+size)>=end)
            return ;
        int max = num[begin];
        for(int i = begin+1; i<begin+size;i++)
        {
            max = num[i]>max?num[i]:max;
        }
        res.add(max);
        help(num,++begin,size,end,res);
    }
}
