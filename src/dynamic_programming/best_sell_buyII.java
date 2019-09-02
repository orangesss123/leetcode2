package dynamic_programming;

public class best_sell_buyII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int max_profit(int []stocks){
		int leng = stocks.length;
		if(leng==0)
			return 0;
		int min=stocks[0];
		int res=0;
		for(int i=1;i<leng;i++)
		{
			res = Math.max(res, stocks[i]-min);
			min = Math.min(min, stocks[i]);
		}
		return res;
	}

}
