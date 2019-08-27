package newcoder;

import java.util.Scanner;

/*
 * 给定一个正整数数组，它的第 i 个元素是比特币第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一次），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入比特币前卖出。
 */
public class getMaxIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String []num = s.split(" ");
		int [] array = new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			array[i]=Integer.parseInt(num[i]);
		}
		int current_min = array[0];
		int currMax_diff = Integer.MIN_VALUE;
		int index = 1;
		int meet_min =array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i] - current_min>currMax_diff)
				currMax_diff = array[i] - current_min;
			if(array[i] - meet_min>currMax_diff)
			{
				currMax_diff = array[i] - meet_min;
				current_min = meet_min;
			}
			if(array[i]<meet_min)
				meet_min = array[i];
		}
		currMax_diff = currMax_diff>0?currMax_diff:0;
		System.out.println(currMax_diff);
	}

}
