package dynamic_programming;
/*
 * 使用贪心策略
 */

public class best_sell_buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxprof(int []stocks){
		int leng = stocks.length;
		if(leng==0)
			return 0;
		int res=0;
		for(int i=1;i<leng;i++)
		{
			if(stocks[i]-stocks[i-1]>0)
				res+=(stocks[i]-stocks[i-1]);
		}
		
		return res;
	}

}
