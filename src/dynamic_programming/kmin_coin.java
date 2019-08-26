package dynamic_programming;

import java.util.Scanner;

/*
 * 假设有2，5，7三种类型的硬币
 * 求：面额为k的最少需要多少枚硬币
 */
public class kmin_coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int k= in.nextInt();
		while(k!=-1)
		{
			System.out.println(min_coins(k));
			k = in.nextInt();
		}
	}
	public static int min_coins(int k){
		//
		int []state = new int[k];
		state[0] = 0;
		for(int i =1;i<k;i++)
		{
			int st2;
			int st5;
			int st7;
			if(i-2<0||(i-2>0&&state[i-2]==Integer.MAX_VALUE))
			{
				st2 = Integer.MAX_VALUE;
			}else{
				st2 = state[i-2]+1;
			}
			if(i-5<0||(i-5>0&&state[i-5]==Integer.MAX_VALUE))
			{
				st5 = Integer.MAX_VALUE;
			}else{
				st5 = state[i-5]+1;
			}
			if(i-7<0||(i-7>0&&state[i-7]==Integer.MAX_VALUE))
			{
				st7 = Integer.MAX_VALUE;
			}else
			{
				st7 = state[i-7]+1;
			}
			state[i] = Math.min(Math.min(st2, st5), st7);
		}
		return state[k-1];
	}

}
